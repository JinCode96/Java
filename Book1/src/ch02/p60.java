package ch02;

/*
 * 날짜 : 2022/08/18
 * 이름 : 김진우
 * 내용 : 자료형 추론
 */

public class p60 {
	public static void main(String[] args) {
		var i = 10; //정수형으로 컴파일
		var j = 10.0; // 더블형으로 컴파일
		var str = "hello"; // 문자열로 컴파일
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; // 다른 문자열은 대입 가능
		// str = 3; -> String 형으로 먼저 사용되어서 정수값을 넣을 수 없다.
		
	}
}
