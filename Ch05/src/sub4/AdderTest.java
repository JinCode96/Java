package sub4;

/*
 * 날짜 : 2022/08/29
 * 이름 : 김진우
 * 내용 : 싱글톤 객체와 인스턴스 객체 실습
 */

class Adder { // Adder 클새스 생성
	private static Adder instance = new Adder(); // 싱글톤
	public static Adder getInstance() { // 외부에서 사용할 수 있도록 get
		return instance;
	}
	private Adder() {} // 생성자
	private Adder(int value) { // 호출되어짐
		y += value;
	}
	
	private int x;  // 멤버변수. 속성
	private static int y; //static 선언
	
	// 오버로드 메소드 (함수 이름 똑같고 매개변수로 구분)
	public void add(int x, int y) {
		this.x += x;
		y++;
	}
	public void add(int[] arr) {
		x += arr[0];
		y += arr[1];
	}
	public static void add(Adder a2) {
		a2.x += 10;
	}
	public static Adder add(Adder a3, int value) {
		return new Adder(value);
	}
	public void show() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}
// Adder 클래스 끝


public class AdderTest {
	public static void main(String[] args) {
		
		int[] arr = new int[2]; // 객체
		arr[0] = 10;
		arr[1] = 20;
		
		// Adder a1 = new Adder();  -> private라서 안됨
		Adder a1 = Adder.getInstance(); // 인스턴스 화
		
		a1.add(1,2);
		a1.show();
		
		a1.add(arr);
		a1.show();
		
		a1.add(a1); 
		a1.show();
		
		a1 = Adder.add(a1, 3); // return 있기 때문에 대입연산자 사용
		a1.show();
		
	}
}
