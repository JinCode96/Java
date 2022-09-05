package sub1;

/*
 * 날짜 : 2022/09/05
 * 이름 : 김진	우
 * 내용 : 자바 API Object 클래스 실습하기
 * 
 * Object 클래스
 *  - 자바의 최상위 클래스로 모든 클래스는 Object를 상속 받음
 *  - 주요기능은 객체 비교를 위한 equals 메서드와 객체정보를 출력하기 위한 toString() 제공
 */


public class ObjectTest {

	public static void main(String[] args) {
		
		// Object 타입으로 다형성
		// 모든 클래스는 Object클래스를 상속받기 때문
		Object a1 = new Apple("한국", 3000);
		Object a2 = new Apple("일본", 2000);
		
		a1.toString();
		a2.toString();
		
		// 객체 비교
		if(a1 == a2) { // 주소값 자체를 비교하는것. 
			System.out.println("a1과 a2가 주소가 같다.");
		}else {
			System.out.println("a1과 a2가 주소가 다르다.");
		}
		
		// String 문자열 비교할 때
		if(a1.equals(a2)) { // 객체를 비교하는 것. equals()
			
			System.out.println("a1과 a2는 객체가 같다.");
			
		}else {
			
			System.out.println("a1과 a2는 객체가 다르다.");

		}
	}
}
