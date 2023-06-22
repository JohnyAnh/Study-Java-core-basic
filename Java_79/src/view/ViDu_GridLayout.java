package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout extends JFrame {

	
	public ViDu_GridLayout() {
		this.setTitle("ViDu_GridLayout");//Tên trương trình
		this.setSize(600, 450);//Kích thước chướng trình
		this.setLocationRelativeTo(null);//Căn giữa màn hình
		
		
		// Set layout
		GridLayout gridLayout = new GridLayout();//Mặc định ở giữa
		GridLayout gridLayout_1 = new GridLayout(4, 4);// Hiển thị nút dạng lưới 4x4
		GridLayout gridLayout_2 = new GridLayout(4, 4, 25,25);// Hiển thị nút dạng lưới 4x4 cách nhau 25 đơn vị
		
		//Dùng vòng lăp để hiện thị 16 nút của lưới 4x4
		for (int i = 0; i < 16; i++) {
			JButton jButton = new JButton(i+"");
			this.add(jButton);
		}
		
		//Chọn layout hiển thị
//		this.setLayout(gridLayout);
//		this.setLayout(gridLayout_1);
		this.setLayout(gridLayout_2);

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Hành động dừng chương trình khi nhấn x
		this.setVisible(true);//Hiển thị trương trình
	}
	public static void main(String[] args) {
		new ViDu_GridLayout();
	}
}
