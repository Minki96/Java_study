package 문제;

import java.util.Scanner;

public class 콘솔연습 {

	public static void main(String[] args) {
		System.out.println("나에 대한 정보");
		System.out.println("---------");
		// 1. 콘솔에서 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 >> ");
		String name = sc.next(); // 단어 입력 받는 기능
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt(); // 단어 입력 받는 기능
		System.out.print("취미 입력 >> ");
		String hobby = sc.next(); // 단어 입력 받는 기능

		// 2. 처리
		// 3. 콘솔(모니터)에 출력
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 취미는 " + hobby);

	}

}
