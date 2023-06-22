package main;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// stackChuoi.push("giatri") => đưa giá trị vào stack
		// stackChuoi.pop() => lấy giá trị ra, xóa khỏi stack
		// stackChuoi.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
		// stackChuoi.clear(); => xóa tất cả phần tử trong stack
		// stackChuoi.contains("giatri")=> xác định giá trị có tồn tại trong stack hay không
		// stackChuoi.size() => độ lớn của stack
		Stack<String> stackChuoi = new Stack<String>();// khai báo một strack mới
		
		// Ví dụ đảo ngược chuỗi
		System.out.println("Nhập vào chuỗi: ");
		String s = sc.nextLine();
		//JohnyAnh
		for (int i = 0; i < s.length(); i++) {
			stackChuoi.push(s.charAt(i)+"");// nhớ cộng thêm ""
		}
		System.out.println("Chuỗi đảo ngược: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(stackChuoi.pop());
		}
		System.out.println();
		
		// Ví dụy chuyển từ hệ thập phân sang nhị phân
		Stack<String> stackSoDu = new Stack<String>();
		System.out.println("Nhập một số nguyên dương từ bàn phím: ");
		int x = sc.nextInt();
		while (x > 0) {
			int soDu = x%2;
			stackSoDu.push(soDu+"");
			x = x/2;
		}
		System.out.println("Số dạng nhị phân là:");
		int n = stackSoDu.size();//Phải để ngoài ko cho vào trong for
		for (int i = 0; i < n; i++) {
			System.out.print(stackSoDu.pop());
		}
	}
}
