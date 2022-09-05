package sub1;

/*
 * 날짜 : 2022/09/05
 * 이름 : 김진	우
 * 내용 : 예외처리 실습하기
 * 
 * 예외처리(Exception)
 *  - 예외는 프로그램 실행 중에 발생하는 모든 오류(Error)
 *  - 실행중(Run-Time)에 발생하는 오류를 대처하고 안정적인 프로그램 개발을 위해 예외처리 수행
 */

public class TryTest {

	public static void main(String[] args) {

		// 예외상황1 : 어떤 수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;
		int rs1 = 0, rs2 = 0, rs3 = 0, rs4 = 0;

		// 예외처리 구현
		// 에러를 잡아내서 프로그램을 계속 진행시키는 역할
		try {
			// 예외가 발생할 가능성이 있는 코드 로직
			rs1 = num1 + num2;
			rs2 = num1 - num2;
			rs3 = num1 * num2;
			rs4 = num1 / num2; // 초기화를 해야 참조가 됨

		// 에러가 발생할 걸 알고 예외처리함
		} catch (ArithmeticException e) { // 매개변수 타입이 exception
			
			e.printStackTrace();
			
		}

		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4); // 참조를 못함

		// 예외상황2 : 배열의 인덱스 범위를 벗어났을 때

		int[] array = { 1, 2, 3, 4, 5 };

		try {
			
			for (int i = 0; i <= 5; i++) {
				System.out.print(array[i] + " ");
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			
		}

		System.out.println();

		// 예외상황3 : Null 포인트 참조 에러
		// 객체 생성을 하지 않고 참조 변수로 메서드를 호출하는 것
		Animal a = null; // 객체 생성 안함

		try {
			a.move();
			a.hunt();

		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		// 예외상황4 : 캐스팅 에러
		Animal a1 = new Tiger(); // 업캐스팅(다형성)
		Animal a2 = new Eagle();

		try {
			// 예외 발생 코드
			Eagle eagle = (Eagle) a1; // 다운캐스팅. 독수리를 호랑이로 형 변환했음
			eagle.move();
			eagle.hunt();

		} catch (ClassCastException e) {
			// 예외처리 코드
			e.printStackTrace();

			Tiger tiger = (Tiger) a1;
			tiger.move();
			tiger.hunt();

		} finally { // 정리 코드가 들어감
			
			System.gc(); // 메모리 정리
			System.out.println("캐스팅 완료...");
			
		}

		System.out.println("프로그램 종료...");
	}

}
