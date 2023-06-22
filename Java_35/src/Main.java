
public class Main {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(11, 2, 2011);
		Ngay ngay2 = new Ngay(12, 4, 2014);
		Ngay ngay3 = new Ngay(13, 6, 2019);
		
		TacGia tg1 = new TacGia("Hoang Anh", ngay1);
		TacGia tg2 = new TacGia("Hoang Nguyen", ngay2);
		TacGia tg3 = new TacGia("Vu Nguyen", ngay3);
		
		Sach s1 = new Sach("Sach 1", 100000, 2022, tg1);
		Sach s4 = new Sach("Sach 4", 200000, 2022, tg1);
		Sach s2 = new Sach("Sach 2", 200000, 2021, tg2);
		Sach s3 = new Sach("Sach 3", 300000, 2021, tg3);
		
		//in tên sách 
		s1.inTenSach();//=> Sach 1
		s4.inTenSach();//=> Sach 4
		s2.inTenSach();//=> Sach 2
		s3.inTenSach();//=> Sach 3
		
		// Kiểm tra cùng năm xuất bản hay không đúng trả về true sai về false
		System.out.println("So sánh NXB Sách 1 và Sách 2: " + s1.kiemTraCungNam(s2));//=> F
		System.out.println("So sánh NXB Sách 1 và Sách 3: " + s1.kiemTraCungNam(s3));//=> F
		System.out.println("So sánh NXB Sách 2 và Sách 3: " + s2.kiemTraCungNam(s3));//=> T
		System.out.println("So sánh NXB Sách 1 và Sách 4: " + s1.kiemTraCungNam(s4));//=> T
		
		// Giá sách sau khi giảm x%
		System.out.println("Giá sách 1 sau khi giảm 10% là: " + s1.giaSauKhiGiam(10));//=>90000
		System.out.println("Giá sách 2 sau khi giảm 20% là: " + s2.giaSauKhiGiam(20));//=>160000
		System.out.println("Giá sách 3 sau khi giảm 50% là: " + s3.giaSauKhiGiam(50));//=>150000
		System.out.println("Giá sách 4 sau khi giảm 50% là: " + s4.giaSauKhiGiam(50));//=>100000
	}
}
