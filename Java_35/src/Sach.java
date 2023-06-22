
public class Sach {
	private String tenSach;
	private double giaBan;
	private int namXuatBan;
	private TacGia tacGia;
	public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacGia) {
		super();
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	public TacGia getTacGia() {
		return tacGia;
	}
	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}
	// Phương thức 1 in tên cuốn sách đó
	public void inTenSach() {
		System.out.println(this.tenSach);
	}
	// Kiểm tra cuốn sách có cùng năm xuất bản hay không
	
	public boolean kiemTraCungNam(Sach sachKhac) {
		// c1 quá tường minh không cần
//		if (this.namXuatBan == sachKhac.namXuatBan) {
//			return true;
//		}else {
//			return false;
//		}
		// C2 return luôn dù sao kết quả trả về true or false
		return this.namXuatBan == sachKhac.namXuatBan;
	}
	// Giá sách sau khi giảm
	public double giaSauKhiGiam(double x) {
		return this.giaBan*(1-x/100);
	}
}
