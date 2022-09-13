package sub1;

public class FruitBox<T> { // 제네릭 선언 <T> 
	
	private T fruit; // 치환변수 T를 사용
	
	public T getFruit() {
		return fruit;
	}
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
	
}
// 바나나와 사과를 함께 사용할 수 있도록 함