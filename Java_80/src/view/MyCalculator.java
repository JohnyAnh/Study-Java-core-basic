package view;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame {
	public MyCalculator() {
		this.setTitle("MyCalculator");
		this.setSize(300, 400);
		this.setLocationRelativeTo(null);
		
		JTextField jTextField = new JTextField(30);//Ô chứa điền thông tin
		JPanel jPanel_head = new JPanel();// Tạo một panel hed mới 
		jPanel_head.setLayout(new BorderLayout());//Sét layout cho nó vào kiểu border 
		jPanel_head.add(jTextField, BorderLayout.NORTH);// sau đấy đặt vị trí trên cùng trong panel này
		
		//Khai báo các button
		JButton jButton_0 = new JButton("0");
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");
		JButton jButton_6 = new JButton("6");
		JButton jButton_7 = new JButton("7");
		JButton jButton_8 = new JButton("8");
		JButton jButton_9 = new JButton("9");
		JButton jButton_Cong = new JButton("+");
		JButton jButton_Tru = new JButton("-");
		JButton jButton_Nhan = new JButton("*");
		JButton jButton_Chia = new JButton("/");
		JButton jButton_Bang = new JButton("=");
		
		JPanel jPanel_buttons = new JPanel();// Tạo một panel chứa các nút vừa khai báo trên
		jPanel_buttons.setLayout(new GridLayout(5,3));//sét kiểu hiển thị trong panel này là Gridlayout và đối tượng mới là jPanel_buttons
		// sau đấy cho các nút vào đối tượng jPanel_buttons
		jPanel_buttons.add(jButton_0);
		jPanel_buttons.add(jButton_1);
		jPanel_buttons.add(jButton_2);
		jPanel_buttons.add(jButton_3);
		jPanel_buttons.add(jButton_4);
		jPanel_buttons.add(jButton_5);
		jPanel_buttons.add(jButton_6);
		jPanel_buttons.add(jButton_7);
		jPanel_buttons.add(jButton_8);
		jPanel_buttons.add(jButton_9);
		jPanel_buttons.add(jButton_Cong);
		jPanel_buttons.add(jButton_Tru);
		jPanel_buttons.add(jButton_Nhan);
		jPanel_buttons.add(jButton_Chia);
		jPanel_buttons.add(jButton_Bang);
		
		// Cuối cùng hiển thị 2 Panel
		this.setLayout(new BorderLayout());
		this.add(jPanel_head, BorderLayout.NORTH);
		this.add(jPanel_buttons, BorderLayout.CENTER);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		//Cách cho look and feel vào hiển thị
		try {
//			com.sun.java.swing.plaf.gtk.GTKLookAndFeel
//			com.sun.java.swing.plaf.motif.MotifLookAndFeel
//			com.sun.java.swing.plaf.windows.WindowsLookAndFeel

//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyCalculator();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
}
