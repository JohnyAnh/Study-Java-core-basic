
public class TacGia {
	private String tenTacGia;
	private Ngay ngaySinhNgay;
	//contrustor
	public TacGia(String tenTacGia, Ngay ngaySinhNgay) {
		this.tenTacGia = tenTacGia;
		this.ngaySinhNgay = ngaySinhNgay;
	}
	//get set
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public Ngay getNgaySinhNgay() {
		return ngaySinhNgay;
	}
	public void setNgaySinhNgay(Ngay ngaySinhNgay) {
		this.ngaySinhNgay = ngaySinhNgay;
	}
	
}
