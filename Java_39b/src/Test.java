public class Test {
	public static void main(String[] args) {
		
		System.out.println("Thong tin class Cha (ConNguoi)");
		ConNguoi nguoi = new ConNguoi("Vu Hoang Anh", 1996);
		nguoi.an();
		nguoi.uong();
		nguoi.ngu();
		
		System.out.println("Thông tin học sinh class con (HocSinh)");
		HocSinh hSinh = new HocSinh("Bui Thuy Giang", 1998, "Kinh te1", "Neu");
		hSinh.an();
		hSinh.uong();
		hSinh.ngu();
		hSinh.lamBaiTap();
		System.out.println("Ten Hoc Sinh " + hSinh.getHoVaTen());
		
	}
}
