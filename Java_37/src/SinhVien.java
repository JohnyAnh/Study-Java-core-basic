
public class SinhVien {
	private String maSinhVien;
	private String hoVaTen;
	private Ngay ngaySinhNgay;
	private double diemTrungBinh;
	private Lop lop;
	public SinhVien(String maSinhVien, String hoVaTen, Ngay ngaySinhNgay, double diemTrungBinh, Lop lop) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.ngaySinhNgay = ngaySinhNgay;
		this.diemTrungBinh = diemTrungBinh;
		this.lop = lop;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public Ngay getNgaySinhNgay() {
		return ngaySinhNgay;
	}
	public void setNgaySinhNgay(Ngay ngaySinhNgay) {
		this.ngaySinhNgay = ngaySinhNgay;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
	// Lay ten khoa
	public String layTenKhoa() {
		return this.lop.getTenKhoa();
	}
	// Kiem tra sinh vien dat hay khong
	public boolean kiemTraThiDat() {
		// return diem neu lon hon 5 la true nguoc lai la false
		return this.diemTrungBinh >= 5;
	}
	
	// Kiem tra sinh vien co trung ngay sinh khong
	public boolean kiemTraTrungNgaySinh( SinhVien svKhac ) {
		//Tao ham so sanh equals ben class Ngay 
		return this.ngaySinhNgay.equals(svKhac.ngaySinhNgay);//=> Trung tra ve true sai false
	}
}
