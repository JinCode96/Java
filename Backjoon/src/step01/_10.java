package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 김진우
 * 내용 : 백준 1단계 10번문제. 킹, 퀸, 룩, 비숍, 나이트, 폰
 */

public class _10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int king = sc.nextInt();
		int queen = sc.nextInt();
		int rook = sc.nextInt();
		int bishop = sc.nextInt();
		int knight = sc.nextInt();
		int poon = sc.nextInt();
		
		System.out.print(1-king+" ");
		System.out.print(1-queen+" ");
		System.out.print(2-rook+" ");
		System.out.print(2-bishop+" ");
		System.out.print(2-knight+" ");
		System.out.print(8-poon);
	}
}
