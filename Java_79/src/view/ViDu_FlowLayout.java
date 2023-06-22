package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FlowLayout extends JFrame {

	
	public ViDu_FlowLayout() {
		this.setTitle("ViDu_FlowLayout");//Tên trương trình
		this.setSize(600, 450);//Kích thước chướng trình
		this.setLocationRelativeTo(null);//Căn giữa màn hình
		
		
		// Set layout
		FlowLayout flowLayout = new FlowLayout();//Mặc định ở giữa
		FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT);// các nút hiện thị ở phải sang trái
		FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER,50 ,50);// các nút hiện thị ở giữa các trên dưới trái phai kích thước 50
		
		//Chọn layout hiển thị
//		this.setLayout(flowLayout);
//		this.setLayout(flowLayout_1);
		this.setLayout(flowLayout_2);
		
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		//add thành phần
		this.add(jButton_1);
		this.add(jButton_2);
		this.add(jButton_3);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Hành động dừng chương trình khi nhấn x
		this.setVisible(true);//Hiển thị trương trình
	}
	public static void main(String[] args) {
		new ViDu_FlowLayout();
	}
}
