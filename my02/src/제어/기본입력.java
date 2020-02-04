package 제어;

import javax.swing.JOptionPane;

public class 기본입력 {

	public static void main(String[] args) {
		String company = JOptionPane.showInputDialog("당신의 소속은? ");
		String result = company + "스터디";
		System.out.println("당신의 소속은 " + result);

	}

}
