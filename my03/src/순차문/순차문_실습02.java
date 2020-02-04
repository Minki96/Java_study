package 순차문;

import javax.swing.JOptionPane;

public class 순차문_실습02 {

	public static void main(String[] args) {
		String a_first = JOptionPane.showInputDialog("첫번째 숫자를 입력해주세요");
		String a_second = JOptionPane.showInputDialog("두번째 숫자를 입력해주세요");
		int first = Integer.parseInt(a_first);
		int second = Integer.parseInt(a_second);
		int result = first + second ; 

		JOptionPane.showMessageDialog(null, "두 수의 합은 "+ result + "입니다.") ;
	}// main end.

} // class end.
