package ch20.mysql.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 부록 p.24

public class ConnectionExample {
	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			// JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 연결하기
			conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.111.200:3306/thisisjava", 
								// thisisjava - 데이터베이스명 , 접속서버 정보
					"java",		// ID
					"mysql"		// PASSWORD
			);
			
			System.out.println("연결 성공");
			
			// DB CRUD
			// 이후에 여기에 데이터추가  -insert  C
			// 데이터를 불러오기  - select	   R			
			// 데이터를 업데이트  - update      U
			// 데이터를 삭제하기  - delete      D
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			if (conn != null) {
				try {
					//연결끊기
					conn.close();
					System.out.println("연결 끊기");
				}catch (SQLException e) {}
			}
		}

	}
}
