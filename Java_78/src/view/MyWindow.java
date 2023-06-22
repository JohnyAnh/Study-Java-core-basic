package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame {

	public MyWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void showIt() {
		this.setVisible(true);
	}
	
	public void showIt(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public void showIt(String titel, int x, int y) {
		this.setTitle(titel);
		this.setSize(x, y);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow m1 = new MyWindow();
		m1.showIt();
		
		MyWindow m2 = new MyWindow();
		m2.showIt("Window2, 200, 100", 150, 100);
		
		MyWindow m3 = new MyWindow();
		m3.showIt("Window 3");
	}
	
}
