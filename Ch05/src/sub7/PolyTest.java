package sub7;

/*
 * 날짜 : 2022/08/31
 * 이름 : 김진	우
 * 내용 : 다형성 실습하기
 * 
 * 다형성(Polymorphism)
 *  - 상속관계에서 부모클래스의 기능이 자식클래스에서 여러 기능(메서드)으로 변하는 특성
 *  - 객체의 타입선언을 부모클래스 타입으로 선언 -> 문법적으로 이것이 다형성임
 *  - 다형성을 이용해서 프로그래밍의 중복을 줄이고 유연성을 높인다.
 */

public class PolyTest {

	public static void main(String[] args) {

		// 다형성을 적용한 객체생성 (업캐스팅)
		// 객체의 타입 선언을 부모의 타입으로 선언한다. -> 다형성
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();

		a1.move();
		a2.move();
		a3.move();

		// a1.hunt(); -> 타입이 Animal로 되어있기 때문에 hunt를 실행 불가
		// Animal 클래스에 hunt를 추가 해줘야함.
		a1.hunt();
		a2.hunt();
		a3.hunt();

		// (다운캐스팅)
		Tiger tiger = (Tiger) a1; // 원래 객체 타입으로 선언. 원상복구
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;

		tiger.move();
		eagle.move();
		shark.move();

		// 객체 타입 비교연산
		// a1이 tiger이 맞는지..
		if (a1 instanceof Tiger) {
			System.out.println("a1은 Tiger 입니다.");
		}

		if (a2 instanceof Eagle) {
			System.out.println("a2는 Eagle 입니다.");
		}

		if (a3 instanceof Shark) {
			System.out.println("a3는 Shark 입니다.");
		}

		// 다형성 활용
		// 객체 배열
		Animal[] arr = { tiger, eagle, shark };
		arr[0].move();
		arr[1].move();
		arr[2].move();

	}

}
