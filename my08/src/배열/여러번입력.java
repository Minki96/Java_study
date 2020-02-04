package 배열;

import java.util.Scanner;

public class 여러번입력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("성적을 입력>> ");
			data[i] = sc.nextInt();
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+ " ");

}
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum= sum +data[i];
		}
		System.out.println();
		System.out.println("총합은 " + sum +"점");
		System.out.println("평균 " + sum/5 +"점");

	}
}
