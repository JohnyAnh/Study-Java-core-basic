package main;

public class Testbox2 {
	public static void main(String[] args) {
		Box2 b1 = new Box2<Integer>(15);
		System.out.println("Giá trị: " + b1.getValueT());
		
		Box2 b2 = new Box2<String>("Hello JohnyVu");
		System.out.println("Kết quả: " + b2.getValueT());
		
		Box2 b3 = new Box2<Double>(15.5);
		System.out.println("Kết quả: " + b3.getValueT());
 	}
}
