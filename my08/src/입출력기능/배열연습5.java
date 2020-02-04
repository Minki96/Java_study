package 입출력기능;

public class 배열연습5 {
	public static void main(String[] args) {
		String[] names = { "홍길동", "김길동", "박길동", "정길동", "빅길동" };
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");

		}
		int[] age = { 20, 4, 36, 55, 56 };
		System.out.println(" ");
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		int[] fs = { 255, 270, 275, 255, 260 };
		System.out.println(" ");
		for (int i = 0; i < fs.length; i++) {
			System.out.print(fs[i] + " ");
		}
		char[] sex = { '남', '여', '남', '여', '여' };
		System.out.println(" ");
		for (int i = 0; i < sex.length; i++) {
			System.out.print(sex[i] + " ");
		}

	}// main end

}// class end
