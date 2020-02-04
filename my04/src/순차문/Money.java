package 순차문;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// 콘솔에서 입력받을 수 있는 부품(class)을 복사해왔음.
		Scanner sc = new Scanner(System.in);
		
		// ----------나의 현금 잔고 ---------
		System.out.println("------나의 현금 잔고 ------");
		// 현재 당신이 가지고 있는 돈은? 1000
		System.out.print("현재 당신이 가지고 있는 돈은? ");
		int now = sc.nextInt();
		// 내일 당신이 가지게 될 돈은? 2000
		System.out.print("내일 당신이 가지게 될 돈은? ");
		int tomorrow = sc.nextInt();
		// ----------------------------
		System.out.println("--------------------");
		int sum = now + tomorrow ;
		// 내일 내가 가지고 있는 돈의 총액은 3000원
		System.out.println("내일 내가 가지고 있는 돈의 총액은" + sum +"원");


	}

}
