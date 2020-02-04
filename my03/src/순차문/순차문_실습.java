package 순차문;

import javax.swing.JOptionPane;

public class 순차문_실습 {

	public static void main(String[] args) {
		String company = JOptionPane.showInputDialog("당신의 소속은 어디입니까?");
		String name = JOptionPane.showInputDialog("당신의 이름은 무엇입니까?");

		JOptionPane.showMessageDialog(null, name + "님은 " + company + "소속입니다.");
	}

}
