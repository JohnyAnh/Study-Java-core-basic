import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		int x = 1;
		Scanner sc = new Scanner(System.in);// cú pháp để chương trình cho phép nhập từ bàn phím
		while (x != 0) {
			System.out.println("Nhập 0 để thoát , nhập bất kỳ số khác để tiếp tục");
			x = sc.nextInt();
		}
		// khối while trên tạo vòng lặp khi nào nhập 0 thì false dừng còn đúng theo biểu thức điều kiện x != 0 thì lặp lại khối lệnh
		int i = 0;// khi nhập 0 thoát vòng lặp thứ nhất code nhảy tới khối code lặp vô tận thứ 2
		while (true) {// Vòng lặp vô tận dừng khi có điều kiện
			System.out.println(i);
			i++;
			if (i == 10) {// Điều kiện dừng khi i chạy tới 10 thì break.
				break;
			}
		}
	}
}
