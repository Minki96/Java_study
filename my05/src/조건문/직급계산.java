package 조건문;

import java.util.Scanner;

public class 직급계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 직급은?");
		String rank = sc.next();
		
		switch (rank) {
		case "사원": System.out.println("보너스는 1000만원 입니다.");		
			break;
		case "과장": System.out.println("보너스는 2000만원 입니다.");		
		break;
		case "사장": System.out.println("보너스는 3000만원 입니다.");		
		break;
		case "회장": System.out.println("보너스는 4000만원 입니다.");		
		break;
		default:
			System.out.println("직급 잘못 입력 했습니다.");


		}
	}
}
