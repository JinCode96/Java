package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 날짜 : 2022/09/15
 * 이름 : 김진우
 * 내용 : JDBC Select 실습하기
 */

public class SelectTest {

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

			// 3단계 - sql 실행객체 생성
			Statement stmt = conn.createStatement();

			// 4단계 - sql 실행
			String sql = "select * from `User2`;";
			ResultSet rs = stmt.executeQuery(sql); // 실행해서 결과를 받아옴

			// 5단계 - select 결과 처리
			while (rs.next()) {

				String uid = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);

				System.out.printf("%s,%s,%s,%d\n", uid, name, hp, age);
			}

			// 6단계 - 데이터베이스 종료
			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료...");

	}

}
