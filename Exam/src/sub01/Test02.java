package sub01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 김진우
 * 내용 : 자바 기본 입출력 연습문제
 */

public class Test02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int year;
		int birth;
		String name;

		System.out.print("올해 년도 입력 : ");
		year = sc.nextInt(); // sc.next() -> 공백 전까지 입력을 받음, sc.nextLine() -> 한 줄 전체를 입력 받음,
								// sc.nextInt(),Double(), +자료 -> 자료형에 따라 입력을 받음.

		System.out.print("태어난 년도 입력 : ");
		birth = sc.nextInt();

		System.out.print("이름 입력 : ");
		name = sc.next(); // 문자열 입력 공백전까지만 받음

		int age = year - birth;

		System.out.printf("%s님 안녕하세요.\n당신은 올해 만 %d세 입니다.", name, age); // 포맷문자

		sc.close(); // 닫아주는 습관 좋음
	}
}
