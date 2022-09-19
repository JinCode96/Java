package sub1;

public class SubThread extends Thread {

	private String name;

	public SubThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(1000); // 1000이 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			System.out.println(name + " 스레드 실행...");
		}

		System.out.println(name + " 스레드 종료...");
	}

}