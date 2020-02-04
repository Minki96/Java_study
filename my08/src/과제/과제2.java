package 과제;

import java.util.Scanner;

public class 과제2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] data = new String[3];
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.next();
			System.out.println("입력받은값은 "+data[i]);
		}
		System.out.println(data[0]+ " 보다는 " +data[1]);
		
		
	}
}
