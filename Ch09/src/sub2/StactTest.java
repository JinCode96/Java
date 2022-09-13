package sub2;

import java.util.Stack;

/*
 * 날짜 : 2022/09/13
 * 이름 : 김진	우
 * 내용 : 자료구조 Stack 실습하기
 */

public class StactTest {

	public static void main(String[] args) {

		// 스택 생성
		Stack<Integer> stack = new Stack<>(); // 객체만 취급하기 때문에 int안됨
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
	}

}
