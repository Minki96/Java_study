package 배열;

import java.util.Random;

public class 임의숫자1000개 {
	public static void main(String[] args) {
		// 로또 번호 6숫자 만들기
		int[] lotto = new int[1000];

		// 아무거나 발생하는 부품
		Random r = new Random();
//		int data = r.nextInt(46);
//		System.out.println(data);

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(1000);

		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]+" ") ;
		}
	}
}
