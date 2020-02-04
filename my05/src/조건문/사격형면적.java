package 조건문;

import java.util.Scanner;

public class 사격형면적 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("사각형 면적을 구하는 프로그램");
		System.out.println("-------------------");
		int width = 7;
		int heigt = 8;
		System.out.println("가로가 7 세로가 8");
		int result = width * heigt;
		System.out.println("면적은 가로 * 세로");

		if (result > 50) {
			System.out.println("너무 넓군요");
		} else {
			System.out.println("너무 좁군요");
		}

		System.out.println("-------------------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("-------------------");
		System.out.println("1) 짜장면, 2) 짬뽕 , 3)우동");
		System.out.println("-------------------");
		System.out.print("당신의 선택은?");
		int choice = sc.nextInt();
			
		if (choice == 1) {
			System.out.println("당신은 짜장면을 주문하셨습니다.");
		} else if (choice == 2) {
			System.out.println("당신은 짬뽕을 주문하셨습니다.");
		} else {
			System.out.println("당신은 우동을 주문하셨습니다.");
		}

	}
}
