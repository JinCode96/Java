package sub3;

public class p78 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i +2) < 10); // 앞 항이 거짓이므로 뒤의 문장 실행되지 않
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // 앞 항이 참이므로 뒤의 항은 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
