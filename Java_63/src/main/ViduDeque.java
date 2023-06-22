package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViduDeque {
	public static void main(String[] args) {
		Deque<String> danhSachSV = new ArrayDeque<String>();
		danhSachSV.offer("Anh1");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("Anh2");
		danhSachSV.offerFirst("Chen vao dau");
		danhSachSV.offerLast("Chen vao cuoi");
		
		// Chen vao dau/Anh1/Nguyen Van A/ Nguyen Van B/ Anh2/Chen vao cuoi
		
		while (true) {
			String ten = danhSachSV.poll();
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
