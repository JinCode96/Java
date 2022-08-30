package sub5;

/*
 * 날짜 : 2022/08/30
 * 이름 : 김진
 * 내용 : Java 클래스 상속 실습하기
 * 
 * 상속(inheritance)
 * - 기존 클래스의 속성과 기능을 그대로 자식 클래스에 물려주는 클래스 확장 문법
 * - 공통적인 로직 내용을 부모클래스에 두고 자식 클래스에서 상속 받아 일관성 있는 프로그래밍 수행
 * - 부모클래스의 속성 접근권한을 protected 선언하고 자식클래스에서 부모클래스 속성을 초기화
 */

// parent class
class Parent {
	private int num1;
	private int num2;

	public Parent(int num1, int num2) { // 생성자에서 초기화
		this.num1 = num1;
		this.num2 = num2;
	}

	public int plus() {
		return num1 + num2;
	}

}

// child class
class Child extends Parent { // parent를 상속 extends
	private int num3; // 부모의 속성을 초기화 해줘야함. 부모의 생성자를 호출해야함
	private int num4;

	public Child(int num1, int num2, int num3, int num4) { // num1, num2도 적어야함
		super(num1, num2); // 부모 클래스를 호출 super
		this.num3 = num3;
		this.num4 = num4;

	}

	public int minus() {
		return num3 - num4;
	}
}

// main
public class InheritTest {

	public static void main(String[] args) {

		// 상속 객체 생성
		Child c = new Child(1, 2, 3, 4);

		// 부모의 기능 사용 상속받았기 때문
		int r1 = c.plus(); // 부모의 기능
		int r2 = c.minus(); // 아들의 기능

		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);

		// Car 상속 객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "파란색", 0, 0);

		sonata.speedUp(100);
		sonata.speedTurbo();
		sonata.show();

		bongo.load(100);
		bongo.speedUp(80);
		bongo.show();

		// Account 상속 객체 생성
		StockAccount kb = new StockAccount("KB증권", "101-12-1010", "홍길동", 0, "삼성전자", 10, 50000);
		kb.deposit(1000000);
		kb.buy(10, 55000);
		kb.sell(15, 56000);
		kb.withdraw(200000);
		kb.show();
	}

}
