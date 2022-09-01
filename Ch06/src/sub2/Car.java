package sub2;

public interface Car { // 클래스가 아닌 인터페이스라 하는 구조체
	// 인터페이스는 속성을 가질 수 없다
	// 오직 추상 메서드만 가질 수 잇음
	
	public void speedUp(int speed); //abstract는 생략
	public void speedDown(int speed); 
	public void show(); 
	
}
