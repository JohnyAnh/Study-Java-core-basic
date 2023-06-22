package test;

import code.Infor;

public class Sub_Infor2 extends Infor {
	public Sub_Infor2() {
		// super.b => không truy cập được => Vì khác package
		super.c = 3;//=> Truy cập được do là lớp con
		super.d = 4;//=> Truy cập được do là lớp con
	}
}
