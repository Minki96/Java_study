package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSlider;
import java.awt.BorderLayout;

public class 그래픽 {

	public static void main(String[] args) {
		// 그래픽 부품 (class) 사용해서 화면을 띄워봅시다! 
		JFrame f = new JFrame();
		f.setSize(800, 800);
		
		JButton b = new JButton();
		b.setForeground(Color.GREEN);
		b.setBackground(Color.CYAN);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b.setText("나를 눌러요..!!!꾹!!!!");
		f.getContentPane().add(b);
		
		f.setVisible(true); // 맨 아래 있어야함.
	}
	
}
