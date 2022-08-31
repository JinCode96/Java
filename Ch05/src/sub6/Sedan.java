package sub6;

public class Sedan extends Car {
	
	// Car의 속성과 기능을 쓸 타이핑 할 필요 없이 상속받을 수 있음
	private int cc; // 부모에게 없는 것만 타이핑하면 됨
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	
	@Override // 세단에 맞게끔 메서드 재정의
	public void speedUp(int speed) {
		this.cc += speed + 20;
	}
	
	public void speedTurbo() {
		this.speed += 20;
	}
	
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("차량속도 : "+speed);
		System.out.println("배기량 : "+cc);
	} // name, color, speed 는 캡슐화 되어있음 (자식한테만 공개를 해야함)
	  // 부모 클래스에서 속성으로 protected 선언하면 가능	
	
	
	
}

