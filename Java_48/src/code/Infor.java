package code;
public class Infor {
	private int a;
	int b;
	protected int c;
	public int d;
	
	public void method() {
		this.a = 1;// truy cập đc do cùng class private
		this.b = 2;// truy cập đc do cùng class int
		this.c = 3;// truy cập đc do cùng class protected
		this.d = 4;// truy cập đc do cùng class public
	}
}
