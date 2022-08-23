package sub2;

/*
 * 날짜 : 2022/08/23
 * 이름 : 김진우
 * 내용 : Java 메서드 실습하기
 * 
 * 메서드(Method)
 * - 자주 사용하는 코드로직을 모듈화한 구조체
 * - 메서드에서 선언한 변수는 지역변수이고 해당 메서드가 종료되면 메모리에서 소멸 
 */

public class MethodTest {
	
	int num = 1;
	// 전역변수 (메소드 밖에 선언된 변수)

	public static void main(String[] args) {

		// 메서드 호출
		int r1 = f(1);
		int r2 = f(2);
		int r3 = f(3);

		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);

		// 메서드 지역변수와 스택
		
		int t1 = sum(1,10); // 1, 10 -> 아규먼트
		int t2 = sum(1, 100);
		
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);

	}// main end

	// 메서드 정의
	public static int f(int x) {
		// void는 반환타입이 없다는 뜻
		// 메서드 이름은 소문자로 시작, x는 매개변수
		int y = 2 * x + 3;
		return y;
	}

	// 메서드 정의
	public static int sum(int start, int end) {
		// start, end -> 파라미터 , 지역변수
		int total = 0;

		for (int k = start; k <= end; k++) {
			total += k;
		}
		return total;
	}

}
