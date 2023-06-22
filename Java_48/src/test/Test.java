package test;

import code.Infor;

public class Test {
	public Infor infor;
	public void method() {
		//this.infor.a=1; Không thể truy khi khác package
		//this.infor.b=2; Không thể truy khi khác package
		//this.infor.c=3; Không thể truy khi khác package 
		this.infor.d = 4; //Truy cập được do public
	}
}
