package main;

public class Testbox {
	public static void main(String[] args) {
		Box box = new Box(15);
		System.out.println("Giá trị: " + box.getValue());
		
//		Box box = new Box(15.5);//Báo lỗi
//		Box box = new Box("Muoi Lam");//Báo lỗi
	}
}
