package 반복문;

import java.util.Scanner;

public class 은행결제 {
	public static void main(String[] args) {
		// 안내
		System.out.println("은행 결제 시스템");
		System.out.println("----------");
		// 선택
		Scanner sc = new Scanner(System.in);
		int out = 0;
		int money = 10000;

		while (out == 0) {
			System.out.println("1) 잔액확인  2)입금  3)출금  4)종료 ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("현재 잔고는 " + money + "원 입니다.");
				break;
			case 2:
				System.out.print( "금액 >>  ");
				int in_money = sc.nextInt();
				System.out.println(in_money + "원을 입금했습니다.");
				money = money + in_money;
				break;
			case 3:
				System.out.print( "금액 >>  ");
				int out_money = sc.nextInt();
				if (money < out_money) {
					System.out.println("출금 금액이 현재 잔액보다 많습니다.");
					System.out.println("-----------------------");

				} else {
					System.out.println(out_money + "원을 출금했습니다.");
					
					money = money - out_money;
					
				}
				break;
			case 4:
				out ++;
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("올바른 값을 입력해주세요.");
				break;
			}
		}
		
	}
}
