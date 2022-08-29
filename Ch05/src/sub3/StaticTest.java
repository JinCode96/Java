package sub3;

/*
 * 날짜 : 2022/08/29
 * 이름 : 김진우
 * 내용 : 클래스 변수, 클래스 메서드 실습하기
 * 
 *  클래스 변수, 클래스 메서드(Static 변수, 메서드)
 *   - static을 선언한 변수, 메서드로 Java Class Area에 생성 
 *   - 별도의 객체생성(new) 하지 않고 해당 클래스 타입으로 참조, 실행
 *   - 객체(인스턴스 -> 메모리 상의 객체)들간의 공유 목적으로 클래스변수, 클래스 메서드 사용
 *   
 *  싱글톤 객체(Singleton)
 *   - 싱글톤 패턴이 적용된 객체는 하나의 인스턴스로 존재
 *   - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대
 */

class Increment {
	private int num1;
	private static int num2; // static 선언

	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
	}

	public static void show() {
		System.out.println("num2 : " + num2);
	}
}

public class StaticTest {

	public static void main(String[] args) {

		// 클래스 변수 실습
		Increment inc1 = new Increment(); // inc1는 참조변수 . 인스턴스화 한것.
		Increment.show();

		Increment inc2 = new Increment();
		Increment.show();

		Increment inc3 = new Increment();
		Increment.show();
		
		Car sonata = new Car("소나타", "흰색", 0);
		Car avante = new Car("아반테", "은색", 0);
		
		sonata.show();
		avante.show();
		
		System.out.println("전체 차량수 : " + Car.count);
		// public으로 둬서 가능
		
		// 싱글톤(singleton) 객체 실습
		// static을 싱글톤 객체로 많이 활용
		
		Calc c1 = Calc.getInstance(); // private로 되어있어서 Calc.getInstance 형태로 객체 생성
		Calc c2 = Calc.getInstance();
		
		int r1 = c1.plus(1,2);
		int r2 = c2.minus(2,3);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
	}
}
