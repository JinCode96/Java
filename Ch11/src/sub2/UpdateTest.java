package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 
 */

public class UpdateTest {
	public static void main(String[] args) {

		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/UserDB";
		String user = "root";
		String pass = "as232800";

		try {
			// 1단계 - jdbc 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);

			// 3단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();

			// 4단계 - SQL 실행
			String sql = "UPDATE `User1` SET `name`='홍길동', `hp`='010-1121-0001' ";
			sql += "WHERE `uid`='j101';";
			stmt.executeUpdate(sql);

			// 5단계 - SELECT 결과 처리
			// 6단계 - 데이터베이스 종료
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료...");

	}
}
