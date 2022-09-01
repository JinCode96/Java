package sub1;

public class Truck extends Car {

	public Truck(String name, String color, int speed) {
		super(name, color, speed);
	}

	@Override
	public void speedUp(int speed) { // 자식클래스에서 세부적 구현
		this.speed += speed;
	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
	}

}
