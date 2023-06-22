public class Test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(3, 5);
		ToaDo td2 = new ToaDo(5, 8);
		ToaDo td3 = new ToaDo(9, 6);
		
//		Hinh hinh = new Hinh(ToaDo td1) {
//		};
		//==> Vì là lớp Abstract nên không thể gọi theo cách thông thường được.Lỗi biên Dịch
		Hinh h1 = new Diem(td1);
		Hinh h2 = new HinhTron(td2, 5);
		Hinh h3 = new HinhChuNhat(td3, 10, 5);
		System.out.println("Diện tích Diem là: " + h1.tinhDienTich());
		System.out.println("Diện tích hình tròn là: " + h2.tinhDienTich());
		System.out.println("Diện tích hình chữ nhật là: " + h3.tinhDienTich());
		
	}
}
