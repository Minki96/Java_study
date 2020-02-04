package 입출력기능;

public class 배열연습4번 {
	public static void main(String[] args) {
		int[] num = new int[5];
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
// 전체 개수를 구해봅시다
		System.out.println(num.length);
		for(int i = 0; i< num.length; i++ ) {
			num[i] = i;
		}
		for(int i = 0; i< num.length; i++ ) {
			System.out.println(num[i]);
		}
	}
}
