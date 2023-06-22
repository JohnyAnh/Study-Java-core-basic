package vidu;
public class SinhVien implements Comparable<SinhVien>{
	private int maSinhVien;
	private String hoVaTen;
	private String tenLop;
	private double diemTrungBinh;
	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public String getTen() {
		//Xóa khoảng trắng 2 đầu dùng trim()
		String s = this.hoVaTen.trim();// như này đỡ phải truyền tham số s vào
		// kiểm tra dùng indexOf >= 0 là tìm thấy khoảng trắng thì cắt khoảng trắng cuối cùng ra
		if (s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");// tạo biết vt kiểm tra xem khoảng trắng cuối cùng 
			return s.substring(vt +1);// Nếu thấy khoảng trắng dùng substring() để lấy đoạn từ khoảng trắng + 1 đv
		}else {// ngược lại 
			return s;// ngược lại không có thì vào trường hợp Adam return về s chuỗi ban đ
		}
	}
	@Override
	public int compareTo(SinhVien o) {
		//So sánh dựa trên maSinhVien
		//<0 đối tượng this đang đứng nhỏ hơn đối tượng o
		//= 0
		//>0
//		return this.maSinhVien - o.maSinhVien;
		//-----------------------------------------------
		//So sánh dựa trên hoVaTen dựa trên kiến thức chuỗi
		// Ten: Adam, Barack Obama,     Nguyen Van A     , Tran Thi Thanh Yen
		//Tạo 2 cái tên truyền vào rỗng
//		String tenThis = "";
//		String tenO = "";
		String tenThis = this.getTen();
		String tenO = o.getTen();
//		//Tiếp theo tạo hàm bên ngoài String getTen() xong quay về sửa 61 62 thành 63 64 comment 66 để return lại
		return tenThis.compareTo(tenO);
		//So sánh điểm trung bình 
//		return (int) (this.diemTrungBinh - o.diemTrungBinh);
	
	}
	
}
