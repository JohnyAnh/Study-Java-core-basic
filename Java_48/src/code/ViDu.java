package code;

public class ViDu {
	 private Infor infor;
	 public void method() {
		//this.infor.a = 1;// Không truy cập vào a được
		 this.infor.b = 2;//=> truy cập đc vào b do cùng package
		 this.infor.c = 3;// Truy cập được vào c do cùng package
		 this.infor.d = 4;// Truy cập được vào c do cùng package
	}
}
