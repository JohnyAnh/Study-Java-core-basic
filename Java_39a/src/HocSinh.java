
public class HocSinh {
	private  String hoVaTen; 
	private int namSinh;
	private String tenTruong;
	public HocSinh(String hoVaTen, int namSinh, String tenTruong) {
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.tenTruong = tenTruong;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getTenTruong() {
		return tenTruong;
	}
	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	public void an() {
		System.out.println("Nhoam Nhoam");
	}
	public void uong() {
		System.out.println("uc uc");
	}
	public void ngu() {
		System.out.println("Kho Kho");
	}
	public void lamBaiTap() {
		System.out.println("lam bai tap abc");
	}
}
