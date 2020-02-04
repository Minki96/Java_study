package 계산기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cal {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField result;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.textHighlight);
		f.setSize(499, 304);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\minki_java\\my07\\005.png"));
		lblNewLabel.setBounds(12, 10, 127, 85);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(170, 65, 57, 30);
		f.getContentPane().add(lblNewLabel_1);

		JLabel label = new JLabel("숫자1");
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBounds(170, 23, 57, 32);
		f.getContentPane().add(label);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 15));
		t1.setBounds(239, 23, 233, 27);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 15));
		t2.setColumns(10);
		t2.setBounds(239, 65, 233, 27);
		f.getContentPane().add(t2);

		JButton sum = new JButton("더하기");
		sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1과 t2 입력값을 가지고 온다.
				// t1과 t2의 타입을 int 로 바꾸자.
				// 두수를 더 한다.
				// 더 한 결과를 result에 넣어준다.
				String t11 = t1.getText();
				String t22 = t2.getText();
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				int t = t111 + t222;
				String t10 = String.valueOf(t);
				result.setText(t10);
			}
		});
		sum.setFont(new Font("굴림", Font.PLAIN, 17));
		sum.setBounds(0, 134, 115, 41);
		f.getContentPane().add(sum);

		JButton sub = new JButton("빼기");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				int t = t111 - t222;
				String t10 = String.valueOf(t);
				result.setText(t10);
			}
		});
		sub.setFont(new Font("굴림", Font.PLAIN, 17));
		sub.setBounds(123, 134, 115, 41);
		f.getContentPane().add(sub);

		JButton button_1 = new JButton("곱하기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				double t111 = Double.parseDouble(t11);
				double t222 = Double.parseDouble(t22);
				double t = t111 * t222;
				String t10 = String.valueOf(t);
				result.setText(t10);
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 17));
		button_1.setBounds(247, 134, 115, 41);
		f.getContentPane().add(button_1);

		JButton button_2 = new JButton("나누기");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				double t111 = Double.parseDouble(t11);
				double t222 = Double.parseDouble(t22);
				double t = t111 / t222;
				String t10 = String.valueOf(t);
				result.setText(t10);
			}
		});
		button_2.setFont(new Font("굴림", Font.PLAIN, 17));
		button_2.setBounds(369, 134, 115, 41);
		f.getContentPane().add(button_2);

		JLabel lblNewLabel_2 = new JLabel("결과화면 : ");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(12, 219, 103, 30);
		f.getContentPane().add(lblNewLabel_2);

		result = new JTextField();
		result.setBounds(123, 219, 349, 30);
		f.getContentPane().add(result);
		result.setColumns(10);
		f.setVisible(true);
	}
}
