package 윈도우;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;

public class china {
	
	//전역변수
	static int 짜장 = 0;
	static int 우동 = 0;
	static int 짬뽕 = 0;
	static int count = 0;

	static int sum = 0;
	private static JTextField t2;
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(60, 179, 113));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("지불할 총 금액");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(25, 408, 153, 47);
		f.getContentPane().add(lblNewLabel);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 20));
		t2.setBounds(190, 412, 282, 39);
		f.getContentPane().add(t2);
		t2.setColumns(10);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		t1.setColumns(10);
		t1.setBounds(352, 10, 120, 39);
		f.getContentPane().add(t1);

		JLabel img = new JLabel("");
		img.setBounds(25, 68, 425, 302);
		f.getContentPane().add(img);

		JLabel j = new JLabel("");
		JLabel u = new JLabel("");
		JLabel jj = new JLabel("");

		JButton btnNewButton = new JButton("짜장");
		btnNewButton.setBounds(12, 20, 97, 23);
		f.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				짜장++;
				j.setText(짜장 + "개");
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				// 짜장그림 img 라벨로 들어가야함.
				ImageIcon icon = new ImageIcon("JJANG.jpg");
				img.setIcon(icon);

			}
		});

		JButton button = new JButton("우동");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				count++;
				우동++;
				u.setText(우동 + "개");
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				ImageIcon icon = new ImageIcon("Udong.png");
				img.setIcon(icon);

			}
		});
		button.setBounds(121, 20, 97, 23);
		f.getContentPane().add(button);

		JButton button_1 = new JButton("짬뽕");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				count++;
				짬뽕++;
				jj.setText(짬뽕 + "개");
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				ImageIcon icon = new ImageIcon("JJAM.jpg");
				img.setIcon(icon);
			}
		});
		button_1.setBounds(225, 20, 97, 23);
		f.getContentPane().add(button_1);

		j.setBounds(37, 53, 57, 15);
		f.getContentPane().add(j);

		u.setBounds(142, 53, 57, 15);
		f.getContentPane().add(u);

		jj.setBounds(246, 53, 57, 15);
		f.getContentPane().add(jj);
		f.setVisible(true);
	}
}
