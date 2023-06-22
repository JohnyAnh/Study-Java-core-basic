package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_BorderLayout extends JFrame {

	
	public ViDu_BorderLayout() {
		this.setTitle("ViDu_FlowLayout");//Tên trương trình
		this.setSize(600, 450);//Kích thước chướng trình
		this.setLocationRelativeTo(null);//Căn giữa màn hình
		
		
		// Set layout
		BorderLayout borderLayout = new BorderLayout();//Mặc định ở giữa
		BorderLayout borderLayout_1 = new BorderLayout(25,25);//Các button cash nhau 25 đơn vị
		
		//Chọn layout hiển thị
//		this.setLayout(borderLayout);
		this.setLayout(borderLayout_1);
		
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");
		//add thành phần
		this.add(jButton_1, BorderLayout.NORTH);
		this.add(jButton_2, BorderLayout.SOUTH);
		this.add(jButton_3, BorderLayout.WEST);
		this.add(jButton_4, BorderLayout.EAST);
		this.add(jButton_5, BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Hành động dừng chương trình khi nhấn x
		this.setVisible(true);//Hiển thị trương trình
	}
	public static void main(String[] args) {
		new ViDu_BorderLayout();
	}
}
