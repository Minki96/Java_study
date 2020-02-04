package 윈도우;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class 메뉴판 {
	static int count = 10;

	public static void main(String[] args) {
		// 큰 프레임을 만들어야 함.
		JFrame f = new JFrame();
		// 도넛의 개수
		// 프레임의 크기를 결정해야 함.

		f.setSize(703, 493);

		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(null, " 바나나 더하기");
				count++;
				System.out.println("바나나의 개수는" + count + "개 입니다.");
				f.setTitle("바나나의 개수: " + count + "개");
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.EAST);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\minki_java\\my06\\바나나1.jpg"));
		f.getContentPane().add(lblNewLabel, BorderLayout.CENTER);

		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(null, " 바나나 빼기");
				if (count == 0) {
					f.setTitle("불가능 합니다.");
				} else {
					count--;
					System.out.println("바나나의 개수는" + count + "개 입니다.");
					f.setTitle("바나나의 개수: " + count + "개");
				}

			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);

		// 프레임을 보여지게 해야함.

		f.setVisible(true);
	}
}
