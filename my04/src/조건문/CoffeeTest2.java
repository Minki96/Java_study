package 조건문;

import java.io.ObjectInputStream.GetField;
import java.util.Date;
import java.util.Scanner;

public class CoffeeTest2 {
	public static void main(String[] args) {
		// 문답
		Scanner sc = new Scanner(System.in);
		Date date = new Date();

		System.out.print("커피 값은? ");
		int coffeePrice = sc.nextInt();
		
		System.out.print("인원 수는? ");
		int count = sc.nextInt();
		int result = coffeePrice * count;
		int discount = coffeePrice * count - 5000 ;
		
		int hour = date.getHours();
		
		if (hour < 22 ) {
			System.out.println("현재 시각이 "+ hour + "시 이므로 가격은 " + result + "원 입니다." );
		} else {
			System.out.println("현재 시각이 "+ hour + "시 이므로 가격은 " + discount + "입니다." );

		}
	}
}
