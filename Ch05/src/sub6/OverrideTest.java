package sub6;

/*
 * 날짜 : 2022/08/31
 * 이름 : 김진	우
 * 내용 : 오버라이드 메서드 실습하기
 * 
 * 메서드 재정의(Override)
 *  - 부모클래스의 메서드를 자식클래스에서 재정의 하는 문법
 *  - 왜 사용하는가? -> 오버라이드를 통해서 객체지향 프로그래밍의 다형성을 구현 (메서드 튜닝)
 */

class AAA {

	public void method1() { // 오버라이드 되어서 ccc에 method1에 덮혀짐
		System.out.println("AAA::method1...");
	}

	public void method2() {
		System.out.println("AAA::method2...");
	}

	public void method3() { // 오버라이드 되지 않아 덮혀지지 않음 (매개변수가 다름)
		// 이건 오버로드임 매개변수로 구분
		System.out.println("AAA::method3...");
	}

}

class BBB extends AAA {

	@Override
	public void method2() {
		System.out.println("BBB::method2...");
	}

	public void method3(int a) {
		System.out.println("BBB::method3...");
	}

}

class CCC extends BBB {

	@Override // -> 오버라이드 표시를 해줘야함 (이건 오버라이드 메서드다)
	public void method1() {
		System.out.println("CCC::method1...");
	}

	@Override // 오버라이드를 하는 메서드
	public void method2() {
		System.out.println("CCC::method2...");
	}

	public void method3(int a, int b) {
		System.out.println("CCC::method3...");
	}

}

public class OverrideTest {
	public static void main(String[] args) {

		// 오버라이드 메서드 실행
		CCC c = new CCC();

		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1, 2);

		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "파란색", 0, 0);
		
		sonata.speedUp(100);
		sonata.speedTurbo();
		sonata.show();
		
		bongo.speedUp(100);
		bongo.show();

	}

}
