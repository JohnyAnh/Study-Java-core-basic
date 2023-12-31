package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	//KHai mangr Arraylist
	private ArrayList<SinhVien> danhSach;//<Teen class muon su dung> bien;

	// Generate Contrustor
	public DanhSachSinhVien() {// tao Contrustor rong thi new mot ArrayList
		this.danhSach = new ArrayList<SinhVien>();// Cách khai báo một ArrayList
	}
	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}
//	1.	Thêm sinh viên vào danh sách.
	public void themSinhVien(SinhVien sv) { //Thêm biến sv truyền vào danh sách
		this.danhSach.add(sv);//Thêm sinh viên vào cuối mảng
//		this.danhSach.add(3, sv); Thêm sinh viên vào vị trí muốn như VarHandleDesc này là vị trí thứ 3 trong mảng
	}
//	2.	In danh sách sinh viên ra màn hình.
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSach) {// dùng forech để duyệt từng phần tử trong mảng sinhVien tự động lấy hết trong danhSach 
			System.out.println(sinhVien);
		}
	}
//	3.	Kiểm tra danh sách có rỗng hay không.
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}
//	4.	Lấy ra số lượng sinh viên trong danh sách.
	public int laySoLuongSinhVien() {
		return this.danhSach.size();
	}
	
//	5.	Làm rỗng danh sách sinh viên.
	public void lamRong() {
		this.danhSach.removeAll(danhSach);
	}
	
//	6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}
	
//	7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}
//	8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(ten)>=0) {
				System.out.println(sinhVien);
			}
		}
	}
//	9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
	public void sapXepSinhVienGiamDan() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if (sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()) {
					return 1;
				}else if (sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()) {
					return -1;
				}else {
					return 0;
				}
			}
		});
	}
//	10.  Lưu danh sách sinh viên xuống tệp tin.
	public void ghiDuLieuFile(File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			for (SinhVien sinhVien : danhSach) {
				oos.writeObject(sinhVien);
			}
			oos.flush();
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public void docDuLieuTuFile(File f) {
//		11.  Đọc dữ liệu từ tệp tin
		try {
			InputStream is = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(is);
			SinhVien sv = null;
			while (true) {
				Object oj = ois.readObject();
				if (oj != null) {
					sv = (SinhVien) oj;
					this.danhSach.add(sv);
				}
				if (oj == null) {
					break;
				}
			}
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	
}
