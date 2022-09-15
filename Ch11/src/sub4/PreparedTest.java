package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2022/09/15
 * 이름 : 김진우
 * 내용 : JDBC PreparedStatement 실습하기
 */

public class PreparedTest {

	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/UserDB";
		String user = "root";
		String pass = "as232800";
		
		try {
			// 1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계
			String sql = "insert into `User2` values (?,?,?,?);";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j103");
			psmt.setString(2, "김유신");
			psmt.setString(3, "010-1022-1001");
			psmt.setInt(4, 27);
			
			// 4단계
			psmt.executeUpdate();
			
			
			// 5단계
			// 6단계
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료...");
		
	}

}
