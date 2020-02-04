package 조건문;

import java.util.Random;
import java.util.Scanner;

public class 아무거나 {
	public static void main(String[] args) {
		// 아무거나 내게 하는 class
		// 랜덤
		
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int computer = r.nextInt(3);

		

	
		System.out.print(" 0) 주먹,  1)보 , 2)가위");
		int user = sc.nextInt();
		
		switch (user) {//주먹을 낸 경우
		case 0:
			switch (computer) { 
			case 0:
				System.out.println("computer는 주먹을 냄");
				System.out.println("Draw");
				break;
			case 1:
				System.out.println("computer는 보를 냄");
				System.out.println("Lose");
				break;
			case 2:
				System.out.println("computer는 가위를 냄");
				System.out.println("Win");
				break;
			}
			break;
		case 1:
			switch (computer) { //내가 보
			case 0:
				System.out.println("computer는 주먹을 냄");
				System.out.println("Win");
				break;
			case 1:
				System.out.println("computer는 보를 냄");
				System.out.println("Draw");
				break;
			case 2:
				System.out.println("computer는 가위를 냄");
				System.out.println("Lose");
				break;
			}
			break;
		case 2:
			switch (computer) { // 내가 가위
			case 0:
				System.out.println("computer는 주먹을 냄");
				System.out.println("Lose");
				break;
			case 1:
				System.out.println("computer는 보를 냄");
				System.out.println("Win");
				break;
			case 2:
				System.out.println("computer는 가위를 냄");
				System.out.println("Draw");
				break;
			}//switch
			break;
		}//switch:me
		System.out.println("computer : " + computer);

		
	}//main
}//class

