package 조건문;

public class CoffeeTest {

	public static void main(String[] args) {
		int price = 5600;
		int count = 5;
		
		int sum = price * count ;
		
		// 25000원이 넘으면 할인 쿠폰 5000원 짜리
		// 아니면 그냥 다 냄. 
		if (sum >= 25000 ) {
			sum = sum - 5000;
		} 
			System.out.println("당신이 지불할 금액은 " + sum + "원");
			
			int hour = 21;
			if (hour < 22) {
				System.out.println("집에 못감");
			} else {
				System.out.println("집에 감");
			}
	}

}
