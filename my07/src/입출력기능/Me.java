package 입출력기능;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Me {
	private static JTextField name;
	private static JTextField age;
	private static JTextField shoe;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 24));
		lblNewLabel.setBounds(35, 112, 57, 36);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("나이");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(35, 158, 62, 36);
		f.getContentPane().add(lblNewLabel_1);

		JLabel label = new JLabel("신발");
		label.setFont(new Font("굴림", Font.PLAIN, 24));
		label.setBounds(35, 212, 62, 36);
		f.getContentPane().add(label);

		name = new JTextField();
		name.setBounds(115, 117, 250, 28);
		f.getContentPane().add(name);
		name.setColumns(10);

		age = new JTextField();
		age.setColumns(10);
		age.setBounds(115, 166, 250, 28);
		f.getContentPane().add(age);

		shoe = new JTextField();
		shoe.setColumns(10);
		shoe.setBounds(115, 212, 250, 28);
		f.getContentPane().add(shoe);

		JButton btnNewButton = new JButton("출력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name.getText();
				if (n.equals("") || n.equals("값을 입력해주세요.")) {
					name.setText("값을 입력해주세요.");
				} else {
					System.out.println("이름 : " + n + "님");

				}

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 24));
		btnNewButton.setBounds(375, 112, 97, 33);
		f.getContentPane().add(btnNewButton);

		JButton button = new JButton("출력");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = age.getText();
				int a2 = Integer.parseInt(a);
				int nextYear = a2 + 1;

				System.out.println("나이 : " + a + "세");
				System.out.println("내년 나이: " + nextYear + "세");

			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 24));
		button.setBounds(377, 158, 97, 33);
		f.getContentPane().add(button);
		JButton button_1 = new JButton("출력");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = shoe.getText();
				if (s.equals("") || s.equals("값을 입력해주세요.")) {
					shoe.setText("값을 입력해주세요.");
				} else {
					System.out.println("신발 : " + s + "mm");
				}

			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 24));
		button_1.setBounds(377, 207, 97, 33);
		f.getContentPane().add(button_1);

		JButton button_2 = new JButton("모두출력");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = shoe.getText();
				String a = age.getText();
				String n = name.getText();

				if (s.equals("") || s.equals("값을 입력해주세요.")) {
					shoe.setText("값을 입력해주세요.");
				} else {
					System.out.println("신발 : " + s + "mm");
				}

				if (s.equals("") || s.equals("값을 입력해주세요.")) {
					shoe.setText("값을 입력해주세요.");
				} else {
					System.out.println("신발 : " + s + "mm");
				}

				if (s.equals("") || s.equals("값을 입력해주세요.")) {
					shoe.setText("값을 입력해주세요.");
				} else {
					System.out.println("신발 : " + s + "mm");
				}

				System.out.println("이름 : " + n + "님");
				System.out.println("나이 : " + a + "세");
				System.out.println("신발 : " + s + "mm");
			}
		});
		button_2.setFont(new Font("굴림", Font.PLAIN, 24));
		button_2.setBounds(168, 283, 155, 33);
		f.getContentPane().add(button_2);

		f.setVisible(true);

	}
}
