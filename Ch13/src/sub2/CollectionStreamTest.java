package sub2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * 날짜 : 2022/09/20
 * 이름 : 김진우
 * 내용 : 컬랙션 스트림 실습하기
 */

public class CollectionStreamTest {

	public static void main(String[] args) {

		String[] names = { "김유신", "김춘추", "장보고", "강감찬", "이순신" };

		// 외부 반복자를 이용한 처리(출력)
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();

		// 내부 반복자를 이용한 처리(출력)
		Stream<String> namesStream = Arrays.stream(names);

		namesStream.forEach((name) -> {
			System.out.print(name + " ");
		});
		System.out.println();

		// 컬랙션 스트림
		List<Person> list = new ArrayList<>();
		list.add(new Person("김유신", 23));
		list.add(new Person("김춘추", 25));
		list.add(new Person("장보고", 35));
		list.add(new Person("강감찬", 45));
		list.add(new Person("이순신", 55));

		// 외부 반복자
		for (Person p : list) {
			System.out.println(p.getName());
		}

		// 내부 반복자
		Stream<Person> personStream = list.stream(); // 컬랙션에 스트림 생성
		personStream.forEach((p) -> {
			System.out.println(p.getName());
		});

	}

}
