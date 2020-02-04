package 과제;

import java.util.Scanner;

public class 과제3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		for (int i = 0; i < data.length; i++) {
			System.out.print("값을 입력하세요.");
			data[i] = sc.nextInt();
			System.out.println("입력받은값은 "+data[i]);
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " " );
		}
	}
}
