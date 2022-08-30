package step01;

import java.util.Scanner;

public class _12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sc1 = sc.nextInt();
		int sc2 = sc.nextInt();
		
		int a = sc2%10;
		int b = sc2/10%10;
		int c = sc2/100;
		
		System.out.println(sc1*a);
		System.out.println(sc1*b);
		System.out.println(sc1*c);
		System.out.println(sc1*sc2);
		
		
		sc.close();
	}
}
