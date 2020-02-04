package 순차문;

import java.util.Scanner;

public class 평균계산02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캔
		// 총 금액
		System.out.print("음식점 계산 총 금액 : ");
		int tot_price = sc.nextInt();
		// 더치페이
		System.out.print("먹을 사람 수 : ");
		int people = sc.nextInt();
		
		double result = tot_price / (double)people;
		System.out.println("내야 할 가격 : " + result + "원");
		// type 을 바꾸는 것 => casting (캐스팅)

	}

}
