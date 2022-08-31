package sub6;

public class Truck extends Car {

		private int capacity;
		
		// 의무적으로 부모의 속성을 초기화 시켜줘야함.
		public Truck(String name, String color, int speed, int capacity) {
			super(name, color, speed); // super를 통해서
			this.capacity = capacity; // 본인 것도 초기화 해줘야함.
		}
		
		@Override // car의 메서드 오버라이드로 재정의
		public void speedUp(int speed) {
			this.speed += speed - 10;
		}
		
		public void load(int capacity) {
			this.capacity += capacity;
		}
		
		public void show() {
			System.out.println("트럭명 : "+name);
			System.out.println("트럭색 : "+color);
			System.out.println("트럭속도 : "+speed);
			System.out.println("적재량 : "+capacity);
		}
		

}
