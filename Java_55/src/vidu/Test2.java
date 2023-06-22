package vidu;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		SinhVien sv1 =new SinhVien(150, "Tran Van Thanh", "Lop 1", 9);
		SinhVien sv2 =new SinhVien(100, "Nguyen Thi Thanh Hoa", "Lop 2", 8);
		SinhVien sv3 =new SinhVien(199, "Nguyen Van An", "Lop 3", 8);
		SinhVien sv4 =new SinhVien(199, "Nguyen Van Bình", "Lop 3", 8);
		
		SinhVien[] a_sv = new SinhVien[] {sv1,sv2,sv3};
		//Hàm sắp xếp 
		//Trước khi sắp xếp
		System.out.println("Trước khi sắp xếp: " + Arrays.toString(a_sv));
		//Sau khi sắp xếp
		Arrays.sort(a_sv);
		System.out.println("Sau khi sắp xếp: " + Arrays.toString(a_sv));
		// Tìm kiếm sinh viên
		System.out.println("Tìm kiếm này sau khi sắp xếp rồi Thứ tự bây giờ An 0, Hoa 1, Thanh 2");
		System.out.println("Tìm kiếm sinh viên tên An là sv3: " + Arrays.binarySearch(a_sv, sv1));
		System.out.println("Tìm kiếm sinh viên tên Bình là sv4 không có trong mảng: " + Arrays.binarySearch(a_sv, sv4));
	}
}
