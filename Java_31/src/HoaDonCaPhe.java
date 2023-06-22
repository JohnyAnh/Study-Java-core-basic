import javax.print.attribute.HashDocAttributeSet;

public class HoaDonCaPhe {
	private String tenLoaiCaPheString;
	private double giaTien1Kg;
	private double KhoiLuong;
	
	// Construstor
	public HoaDonCaPhe(String ten, double gia, double kl) {
		this.tenLoaiCaPheString = ten;
		this.giaTien1Kg = gia;
		this.KhoiLuong = kl;
	}
	public double tinhTongTien() {
		return this.giaTien1Kg * this.KhoiLuong;
	}
	public boolean kiemTraKhoiLuongLonHon(double kl) {
		return this.KhoiLuong > kl;
	}
	public boolean kiemTraTongTienLonHon500K() {
		return this.tinhTongTien() > 500000;
	}
	public double giamGia(double x) {
		if (this.tinhTongTien()>500000) {
			return (x/100)*this.tinhTongTien();
		}else {
			return 0;
		}
		
	}
	public double giaSauKhiGiam( double x) {
		return this.tinhTongTien() - this.giamGia(x);
	}
}
