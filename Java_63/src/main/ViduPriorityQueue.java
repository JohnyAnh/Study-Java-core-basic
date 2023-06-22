package main;

import java.util.PriorityQueue;
import java.util.Queue;

public class ViduPriorityQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new PriorityQueue<String>();
		danhSachSV.offer("Anh1");
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("Anh2");
		
		while (true) {
			String ten = danhSachSV.poll();//poll lấy Queue rồi xóa
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
