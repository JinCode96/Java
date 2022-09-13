package sub3;

public class Apple // extends Object. 모든 클래서은 Object클래스를 상속받고 있는 거임
{

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		// 객체 정보 조회
		System.out.println("객체번호 : " + hashCode());
		System.out.println("원산지 : " + country);
		System.out.println("가격 : " + price);
		
		return super.toString();
	}
	

	
}
