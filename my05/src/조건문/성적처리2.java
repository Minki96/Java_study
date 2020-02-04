package 조건문;

public class 성적처리2 {

	public static void main(String[] args) {
		// 점수가 88점이라고 해봅시다.!
		int score = 88;
		
		if (score >= 90) {
			System.out.println("A학점");
		} else if(score >= 80) {
			System.out.println("B학점");
		} else if(score >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("D학점");
		}
	} // main end

} // class end
