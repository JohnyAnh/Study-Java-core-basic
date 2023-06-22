public abstract class Hinh {
	protected ToaDo toaDo;

	public Hinh(ToaDo toaDo) {
		this.toaDo = toaDo;
	}

	public ToaDo getToaDo() {
		return toaDo;
	}

	public void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
// Phương thức trừu tượng Abstract
	public abstract double tinhDienTich();//==> khác với các phương thức bt là sau () là ; luôn
	// Sau khi tạo ra phương thức thì lập tức
	// các lớp con của lớp abstract này báo lỗi phải sang lớp con thêm phương thức tinhDienTich
	//Hết lỗi rồi vì sao?=> Vì trong hình ảnh có phương thức trừu tượng, pttt nó không thật
	// Kêu tính diện tích nhưng nó không biết tính diện tính kiểu gì nên các lớp con là
	//hình ảnh cụ thể đó sẽ tính mỗi class sẽ có cách tính khác nhau
	
}
