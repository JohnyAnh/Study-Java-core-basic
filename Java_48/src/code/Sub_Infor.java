package code;
public class Sub_Infor extends Infor {// Lớp con
	public Sub_Infor() {
		//super.a => không thể truy cập được khi khai báo a là private
		//super.b => Truy cập được => Vì chung gói package
		super.c = 3;//Truy cập được
		super.d = 4;//Truy cập được
	}
}
