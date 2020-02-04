package 반복문;

import java.util.Scanner;

public class 투표 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 아이유, 유재석, 공유

		System.out.println("---------------");
		System.out.println("1)아이유   2)유재석   3)공유");
		System.out.println("---------------");
		
		int IU = 0;
		int JS = 0;
		int GU = 0;

		// 5번 투표 기회
		// 당신의 선택은?

		for (int coin = 0; coin < 5; coin++) {
			System.out.println("당신의 선택은?");
			int answer = sc.nextInt();
			if (answer == 1 ) {
				IU++;
			} else if (answer == 2 ) {
				JS++;
			} else if (answer == 3) {
				GU++;
			} else {
				System.out.println("1, 2, 3번만  선택 가능합니다.");
				coin--;
			}
			
		}
			// 아이유, 유재석, 공유 투표수
		System.out.println("---------------");
		System.out.println("아이유 : " + IU + "표");
		System.out.println("유재석 : " + JS + "표");
		System.out.println("공유 : " + GU + "표");

		
	}

}
