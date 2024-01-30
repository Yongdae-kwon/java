package ch20.mysql.sec09.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


// 사용자 정보 읽기
public class UserSelectExample {
	public static void main(String[] args) {
		
		Connection conn = null;		
		try {		
			// JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			// 연결하기
			conn = DriverManager.getConnection(
				"jdbc:mysql://192.168.111.200:3306/thisisjava",
				"java",
				"mysql"
		);
			
		// 매개변수화된 SQL 문 작성	
		// userid가 winter인 사용자 정보를 가져오는 SELECT문
		// 조건절의 값을 ? 로 대체한 매개변수화된 SQL 문을 String 타입 변수 sql에 대입
		String sql = "" +
			"SELECT userid, username, userpassword, userage, useremail " +
			"FROM users " +
			"WHERE userid=?";
		
		// 매개화 변수된 SELECT 문을 실행하기 위해 PreparedStatement 문으로 데이터 입력
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "winter");
		
		// SQL 문 실행 후 , ResultSet을 통해 데이터 읽기
		// SELECT 문 이후 결과 값을 ResultSet
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {  	// 1개의 데이터 행을 가져왔을 경우
			User user = new User();
			user.setUserId(rs.getString("userid"));
			user.setUserName(rs.getString("username"));
			user.setUserPassword(rs.getString("userpassword"));
			user.setUserAge(rs.getInt(4));		  // 컬럼 순번을 이용
			user.setUserEmail(rs.getString(5));   // 컬럼 순번을 이용
			System.out.println(user);
		} 
		  else { 		// 데이터 행을 가져오지 않았을 경우
			System.out.println("사용자 아이디가 존재하지 않음");
		}
		rs.close();
		
			// PreparedStatement 닫기
			pstmt.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// 연결 끊기
					conn.close();
				} catch(SQLException e) { }
			}
		}
	}
}
