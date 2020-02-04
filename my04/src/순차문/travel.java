package 순차문;

import java.util.Scanner;

public class travel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 여행정보
		System.out.println("< 여행 정보 >");
		System.out.println("----------");
		// 여행지: 제주도
		System.out.print("여행지 :  ");
		String place = sc.next();

		System.out.print("경비 :  ");
		int price = sc.nextInt();

		System.out.print("할인율 :  ");
		double discount = sc.nextDouble();

		System.out.print("실제경비 :  ");
		double result = price - price * discount;
		System.out.println((int)result + "원");

		System.out.println("----------");
		System.out.println("12월 여행갔을때 가격");


		// 경비

	}

}
