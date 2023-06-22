public abstract class PhuongTienDiChuyen {
	private String loaiPhuongTien;
	private HangSanXuat hangSanXuat;
	//Constructor
	public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}
	//Get Set
	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}
	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	// Phuong thuc Method
	public String layTenHangSanXuat(){
		return this.hangSanXuat.getTenHangSanXuat();
	}
	public void batDau() {
		System.out.println("Bat dau");
	}
	public void tangToc() {
		System.out.println("Tang toc");
	}
	public void ketThuc() {
		System.out.println("Ket thuc");
	}
	public void dungLai() {
		System.out.println("Dung lai");
	}
	// Tạo method Abstract thì nên tạo các lớp con trước 
	public abstract double layVanToc();
	
}
