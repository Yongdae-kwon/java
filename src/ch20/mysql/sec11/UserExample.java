package ch20.mysql.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import ch20.mysql.sec11.User;

public class UserExample {	
		
		// 필드
		private Scanner scanner = new Scanner (System.in);
		private Connection conn;
		
		// Constructor
		public UserExample() {		
			try {		
				// JDBC Driver 등록
				Class.forName("com.mysql.cj.jdbc.Driver");		
				// 연결하기
				conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.111.200:3306/thisisjava",
					"java",
					"mysql"
			);
				
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		// Method	
		public void list() {
			
			// 타이틀 및 컬럼명 출력
			System.out.println();
			System.out.println("[게시물 프로그램]");
			System.out.println("-------------------------------------------");
			System.out.printf("%-6s%-12s%-16s%-40s\n", "id", "password");
			System.out.println("-------------------------------------------");
		
			// boards 테이블에서 게시물 정보를 가져와서 출력하기		
			try {
				String sql = "" +
					"SELECT userid, userpassword " +
					"FROM users " ;
					
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				
				while (rs.next()) {
					User user = new User ();
					user.setUserid(rs.getString("userid"));					
					user.setUserpassword(rs.getString("userpassword"));
					System.out.printf("%-6s%-12s%-16s%-40s \n",
							user.getUserid(),
							user.getUserpassword());						
				}
				rs.close();
				pstmt.close();
				
			} catch(SQLException e) {
				e.printStackTrace();
				exit();
			}
			
			// 메인 메뉴 출력
			mainMenu();
		}
		
		
		
		
		public static void main(String[] args) {
			UserExample userExample = new UserExample();
			userExample.list();
		}

}
