package sub3;

// 싱글톤 : 클래스 자기자신이 객체를 생성


public class Calc {

	private static Calc instance = new Calc(); // 싱글톤
	public static Calc getInstance() { // 클래스 타입으로 바로 호출
		return instance;
	}
	
	private Calc() {
		
	}
	
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int minus(int x, int y) {
		return x-y;
	}
	
	public int multi(int x, int y) {
		return x*y;
	}
	
	public int div(int x, int y) {
		return x/y;
	}

}
