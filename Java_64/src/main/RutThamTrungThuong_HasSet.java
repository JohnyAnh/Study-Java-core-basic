package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HasSet {
	Set<String> thungHopPhieuDuThuong = new HashSet<>();

	public RutThamTrungThuong_HasSet() {

	}

	public boolean themPhieu(String giaTri) {
		return this.thungHopPhieuDuThuong.add(giaTri);
	}

	public boolean xoaPhieu(String giaTri) {
		return this.thungHopPhieuDuThuong.remove(giaTri);
	}

	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.thungHopPhieuDuThuong.contains(giaTri);
	}

	public void xoaTatCa() {
		this.thungHopPhieuDuThuong.clear();
	}

	public int soLuongPhieuDuThuong() {
		return this.thungHopPhieuDuThuong.size();
	}

	public String rutMotPhieu() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.thungHopPhieuDuThuong.size());
		ketQua = (String) this.thungHopPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}

	public void inTatCa() {
		System.out.println(Arrays.toString(this.thungHopPhieuDuThuong.toArray()));
	}

	public static void main(String[] args) {
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		
		RutThamTrungThuong_HasSet rt = new RutThamTrungThuong_HasSet();
		do {
			System.out.println("--------------------------------");
			System.out.println("Menu: ");
			System.out.println("1. Them ma so du thuong");
			System.out.println("2. xoa ma so du thuong");
			System.out.println("3. Kiem tra ma so du thuong co toon tai hay khong");
			System.out.println("4. Xoa tata ca phieu du thuong");
			System.out.println("5. So luong phieu du thuong");
			System.out.println("6. Rut tham trung thuong");
			System.out.println("7. In tat ca cac phieu");
			System.out.println("0. Thoat khoi chuong trinh");
			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
				System.out.println("Nhap ma so du thuong: ");
				String giaTri = sc.nextLine();
				if (luaChon == 1) {
					rt.themPhieu(giaTri);
				}else if (luaChon ==2) {
					rt.xoaPhieu(giaTri);
				}else {
					System.out.println("Ket qua kiem tra: " + rt.kiemTraPhieuTonTai(giaTri));
				}
			}else if (luaChon ==4) {
				rt.xoaTatCa();
			}else if (luaChon == 5) {
				System.out.println("So luong phieu du thuong la: " + rt.soLuongPhieuDuThuong());
				
			}else if (luaChon ==6) {
				System.out.println("ma trung thuong la: " + rt.rutMotPhieu());
			}else if (luaChon == 7) {
				rt.inTatCa();
			}
		} while (luaChon != 0);
	}
}
