public class Test {
	public static void main(String[] args) {
		HangSanXuat hSanXuat1 = new HangSanXuat("Hang 1", "Viet nam");
		HangSanXuat hSanXuat2 = new HangSanXuat("Hang 2", "China");
		HangSanXuat hSanXuat3 = new HangSanXuat("Hang 3", "USA");
		
		PhuongTienDiChuyen p1 = new MayBay(hSanXuat1, "Xang");
		PhuongTienDiChuyen p2 = new XeOto(hSanXuat2, "Xang");
		PhuongTienDiChuyen p3 = new MayBay(hSanXuat3, "Dau");
		System.out.println("Ten hang ptien p1: "+p1.layTenHangSanXuat());
		p1.batDau();
		p1.tangToc();
		p1.ketThuc();
		p1.dungLai();
		//Gọi phương thức Abstract
		System.out.println("Van toc may bay la: "+ p1.layVanToc());
		System.out.println("Van toc oto la: "+p2.layVanToc());
		System.out.println("Van toc xe dap la: "+p3.layVanToc());
		//Gọi phương thức riêng của lớp con thì phải tạo riêng không liên quan tới abstract
		MayBay m1 = new MayBay(hSanXuat3, "Xang");
		System.out.println("May bay");
		m1.catCanh();
		m1.haCanh();
	}
}
