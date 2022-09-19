package sub2;

public class Count {

	private int num;

	public int getNum() {
		return num;
	}

	// 동기화 블럭 :객체에 잠금을 걸 다른 스레드가 참조할 수 없게 한다.
	public synchronized void setNum() { // 동기화 락을 건다
		
		num++;
	
	}

}
// 원래 서로 참조하려고 경합이 발생함 -> 정확한 값이 안 나옴