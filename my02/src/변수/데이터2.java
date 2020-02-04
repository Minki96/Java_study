package 변수;

public class 데이터2 {

	public static void main(String[] args) {
		// 컴퓨터가 인식하는 데이터는 무엇인가?
		// 기본 데이터
		// 숫자(정수, 실수), (문자)1글자, 맞는지 여부 (논리)

		int year; // RAM 에 저장공간이 만들어진다.!
		year = 2020;

		int age = 100; // = (등호) : 저장공간(변수)에 값을 넣는 것.
		double eye = 0.7;

		char sn = '1';
		boolean coffee = false;
		System.out.println("내 나이는 " + age + "살");
		System.out.println("내 시력은 " + eye);
		System.out.println("내 주민번호 앞자리는 " + sn + "로 시작");
		System.out.println("오늘 커피 먹었닝? " + coffee);

		// 모든 연산은 CPU가 한다.
		System.out.println(age + 1);
		int nextAge = age + 1;
		System.out.println("내 내년 나이는 " + nextAge);

	}

}
