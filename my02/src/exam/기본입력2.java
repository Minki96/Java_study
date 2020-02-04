package exam;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 기본입력2 {

	public static void main(String[] args) throws IOException {
		String str1 = JOptionPane.showInputDialog("1. 문자를 입력해주세요.") ;
		String str2 = JOptionPane.showInputDialog("2. 문자를 입력해주세요.") ;
		String result = str1 + " "+ str2 ;
		// System.out.println("당신이 입력한 문자는 "+ result +"입니다") ;
		
		// JOptionPane.showMessageDialog(null, result);
		
		FileWriter file = new FileWriter("win.txt");
		file.write(result);
		file.close();
		
	}

}
