public class HangSanXuat {
	private String tenHang;
	private QuocGia quocGia;
	public HangSanXuat(String tenHang, QuocGia quocGia) {
		this.tenHang = tenHang;
		this.quocGia = quocGia;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public QuocGia getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}
	public String layTenQuocGia() {
		// để lấy được tên quốc gia thì cần gọi biến quocGia.getQuocGia
		return this.quocGia.getQuocGia();
	}
	
}
