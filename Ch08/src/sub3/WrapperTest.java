package sub3;

/*
 * 날짜 : 2022/09/08
 * 이름 : 김진	우
 * 내용 : Wrapper 클래스 실습하기
 * 
 * Wrapper 클래스
 *  - 기본타입의 값을 객체로 변환하기 위해 사용하는 클래스
 *  - 제네릭과 컬렉션에서 다루는 데이터는 객체이기 때문에 Wrapper 활용
 */

public class WrapperTest {

	public static void main(String[] args) {

		// 기본타입(primitive)
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;

		// Wrapper 클래스 포장(Boxing)
		Integer box1 = new Integer(var1);
		Double box2 = new Double(var2);
		Boolean box3 = new Boolean(var3);
		// 밑줄은 좋지 않은 코딩 방식이라는 것을 알려주는 것임. 상위 버전에선 이렇게 사용 안 될수도 있다.

		System.out.println("box1 : " + box1);
		System.out.println("box2 : " + box2);
		System.out.println("box3 : " + box3);

		// 문자열 -> 기본타입으로 변환 (parse)
		String str1 = "1";
		String str2 = "2.14";
		String str3 = "false";

		int value1 = Integer.parseInt(str1);
		double value2 = Double.parseDouble(str2);
		boolean value3 = Boolean.parseBoolean(str3);

		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);

		// 문자열 -> Wrapper타입으로 변환
		Integer w1 = Integer.valueOf(str1);
		Double w2 = Double.valueOf(str2);
		Boolean w3 = Boolean.valueOf(str3);

		System.out.println("w1 : " + w1);
		System.out.println("w2 : " + w2);
		System.out.println("w3 : " + w3);

		// Wrapper -> 문자열 타입으로 변환
		String s1 = w1.toString(); // Object의 메서드. 객체 정보를 출력
		String s2 = w2.toString();
		String s3 = w3.toString();

		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);

		// Wrapper -> 기본 타입으로 변환 (Auto-Unboxing)
		int v1 = w1;
		double v2 = w2;
		boolean v3 = w3; // 이건 바로 됨

		// 기본타입 -> Wrapper 타입으로 변환 (Auto-Unboxing)
		Integer wr1 = v1;
		Double wr2 = v2;
		Boolean wr3 = v3; // 이것도 바로 됨. 그냥 끄집어 낸 것

		System.out.println("wr1 : " + wr1);
		System.out.println("wr2 : " + wr2);
		System.out.println("wr3 : " + wr3);

	}

}
