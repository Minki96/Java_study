package 조건문;

import java.util.Date;

public class 요일처리 {
	public static void main(String[] args) {
		
		Date date = new Date();
		int day = date.getDay();
//		
//		if(day == 0 || day == 6) {
//			System.out.println("실습하러 갑시다");
//		} else if(day == 1 || day == 2 || day == 3 ||  day == 4 ) {
//			System.out.println("학원갑시다");
//		} else {
//			System.out.println("일합시다");
//		}
		switch (day) { // 실수가 올 수 없음
		case 0: 
			System.out.println("일");
			break;
		case 1: 
			System.out.println("월");
			break;
		case 2: 
			System.out.println("화");
			break;
		case 3: 
			System.out.println("수");
			break;
		case 4: 
			System.out.println("목");
			break;
		case 5: 
			System.out.println("금");
			break;
		case 6: 
			System.out.println("토");
			break;
		}
		
	}
}
