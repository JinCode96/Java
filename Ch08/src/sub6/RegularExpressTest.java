package sub6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * 날짜 : 2022/09/08
 * 이름 : 김진	우
 * 내용 : 정규표현식 클래스 실습하기
 * 
 * 정규표현식(Regular Expression)
 *  - 특정규칙을 가진 문자열 집합을 표현하기 위한 형식언어
 *  - 문자열 패턴을 검사하거나 또는 문자열 치환에 많이 사용
 */

public class RegularExpressTest {

	public static void main(String[] args) {

		// 정규표현식 b[a-z]* 오직 소문자만 나와야함. b로 시작. 문자열을 검사하기 위한 약속
		String patt = "b[a-z]*";

		boolean r1 = Pattern.matches(patt, "bat");
		boolean r2 = Pattern.matches(patt, "cat");

		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);

		// 정규표현식 패턴
		String[] patterns = { ".", // 문자 1개를 의미
				"[a-z]?", // ? 는 문자 1개를 의미
				"[0-9]+", // 숫자 1개 이상을 의미
				"0[0-9]*", // 0으로 시작하는 숫자 0개 이상 의미
				"^[0-9]", // 숫자로 시작하는 문자
				"[^0-9]", // 숫자가 아닌 문자 not
				"[a-z]*", // 영어 소문자 0개 이상 (*는 0개 이상)
				"[a-z]+", // 영어 소문자 1개 이상
				"[A-Z]*", // 영어 대문자 0개 이상
				"[가-힣]+", // 한글 1자 이상
				"\\s", // 공백
				"\\S", // 공백이 아닌 문자
				"\\d", // 숫자
				"\\w", // 숫자와 문자
				"\\W" // 특수문자
		};

		String[] words = { "bat", "010휴대폰", "123456", "011", "hello", "홍길동", "01", "a", "A", "7", "#" };

		for (String word : words) {

			System.out.print(word + "문자와 일치하는 패턴 : ");

			for (String ptt : patterns) {
				boolean result = Pattern.matches(ptt, word);

				if (result) {
					System.out.print(ptt + ", ");
				}
			}
			System.out.println("");
		}

		// 자주 사용하는 정규표현식
		String ptt1 = "^[a-zA-Z0-9]*$"; // $는 종결문자
		String ptt2 = "^[가-힣]*$"; // 엉뚱한 입력 못하게끔
		String ptt3 = "(01\\d{1})-(\\d{3,4})-(\\d{4})"; // 휴대폰 정규표현식 () -> 그룹
		String ptt4 = "(\\w+)@(\\w+).(\\w+)"; // 이메일 정규표현식

		String str = "이름:홍길동, 휴대폰:010-1234-1001, 휴대폰:011-123-1001, 이메일:hong@gmail.com";

		Pattern pt1 = Pattern.compile(ptt3);
		Matcher mt1 = pt1.matcher(str);

		System.out.println("휴대폰 조회");
		while (mt1.find()) {
			System.out.println(mt1.group());
		}

		Pattern pt2 = Pattern.compile(ptt3);
		Matcher mt2 = pt2.matcher(str);

		System.out.println("이메일 조회");
		while (mt1.find()) {
			System.out.println(mt2.group());
		}
	}
}
