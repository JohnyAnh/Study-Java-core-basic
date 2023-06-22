package test;

public class Main {
	public static void main(String[] args) {
		ThoiKhoaBieu TK1 = new ThoiKhoaBieu(Day.Monday, "Toán, lý, hóa");
		ThoiKhoaBieu TK2 = new ThoiKhoaBieu(Day.Tuesday, "Văn, Sử, Địa");
		ThoiKhoaBieu TK4 = new ThoiKhoaBieu(Day.Monday, "GDCD, Toán, Văn");
		ThoiKhoaBieu TK5 = new ThoiKhoaBieu(Day.Monday, "Lý, Hóa, Anh");
		System.out.println(TK1);//=>ThoiKhoaBieu [thuDay=Monday, cacMonHoc=Toán, lý, hóa]
		
		
		int x = Thang.Tháng_1.soNgay();
		System.out.println(x);//=>31
	}
}
