package view;

import javax.swing.JFrame;

public class ViDu {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		//Kích thước chương trình
		jf.setSize(600, 300);
		
		//Đặt tên cho ứng dụng
		jf.setTitle("Day la ung dung dau tien JFrame");
		
		//Gắn vị trí hiển thị
		jf.setLocation(222, 100);
		
		//Thoát khỏi chương trình khi đóng cửa sổ
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
