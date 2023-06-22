
public class BoPhim {
	private String tenPhim;
	private int namSanXuat;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private Ngay ngayChieuNgay;
	public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieuNgay) {
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieuNgay = ngayChieuNgay;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public Ngay getNgayChieuNgay() {
		return ngayChieuNgay;
	}
	public void setNgayChieuNgay(Ngay ngayChieuNgay) {
		this.ngayChieuNgay = ngayChieuNgay;
	}
	
	// So sánh giá vé
	public boolean kiemTraGiaVeReHon(BoPhim phimKhac) {
		if (this.giaVe < phimKhac.giaVe) {
			return true;
		}else {
			return false;
		}
		
		
//		return this.giaVe < phimKhac.giaVe;
	}
	
	public String layTenHangSanXuat() {
		return this.hangSanXuat.getTenHangSanXuat();
	}
	
	public double giaVeKhuyenMai (double x) {
		return this.giaVe*(1-x/100);
	}
}
