public class Main {
	public static void main(String[] args) {
		ConNguoi cNguoi = new ConNguoi("Vu Hoang Anh", 2023);
		cNguoi.an();
		cNguoi.uong();
		
		NguoiMy ngUSA = new NguoiMy("My", 2012);
		ngUSA.an();
		NguoiTrungQuoc china = new NguoiTrungQuoc("Tau khua", 2014);
		china.an();
		NguoiVN vn = new NguoiVN("Viet Nam Vo Dich", 9999);
		vn.an();
	}
}
