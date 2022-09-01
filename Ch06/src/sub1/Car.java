package sub1;

public abstract class Car { // abstract 선언. 추상 클래스

	protected String name;
	protected String color;
	protected int speed;

	public Car(String name, String color, int speed) {
		this.name = name;
		this.speed = speed;
		this.color = color;
	}

	public abstract void speedUp(int speed); // 내용이 없는 메서드 -> 추상메소드
	// abstract를 선언
	// 기능을 선언만 해주는 것 -> 추상 메서드

	public abstract void speedDown(int speed);

	public void show() {
		System.out.println("차량명 : " + name);
		System.out.println("차량색 : " + color);
		System.out.println("차량속도 : " + speed);
	}
}
