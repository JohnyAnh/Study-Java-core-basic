package main;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.event.TableColumnModelListener;

public class ViduQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new LinkedList<String>();
//		Queue<String> danhSachSV = new PriorityQueue<String>();
		danhSachSV.offer("Anh1");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("Anh2");
		
		//In ra rồi xóa luôn
		while (true) {
			String ten = danhSachSV.poll() ;// =>poll lấy ra rồi xóa
			//peek => lấy ra nhưng không xóa
			if (ten == null) {
				break;
			}
			System.out.println(ten);
			
			
		}
	}
}
