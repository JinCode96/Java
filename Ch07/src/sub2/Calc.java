package sub2;

public class Calc {
	
	// 싱글톤 객체 만들기
	private static Calc instance = new Calc();
	
	// get하고 옵션 스페이스
	public static Calc getInstance() {
		return instance;
	}
	
	// new Calc 못하게 하려고
	private Calc() {}
		
	public int Plus(int x, int y) { 
		return x+y;
	}
	
	public int Minus(int x, int y) {
		return x-y;
	}
	
	public int Multi(int x, int y) throws Exception {
		
		if(y <= 0) {
			// 사용자 예외 강제 발생
			Exception e = new Exception("y는 0보다 작거나 같으면 안됩니다.");
			// 예외를 던짐
			throw e;
		}
		
		return x*y;
		
	}
	// 이 메서드에서 발생되는 에러를 던지겠다. 해당 메서드를 호출한 곳으로 예외 던짐
	public int div(int x, int y) throws Exception {
		return x/y;
	}
		
	
	
}
