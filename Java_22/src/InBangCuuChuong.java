
public class InBangCuuChuong {
	public static void main(String[] args) {
		/*
		 *  Bảng cửu chương có dạng 
		 *   2 x 1 = 2
		 *   2 x 2 = 4
		 *   .
		 *   .
		 *   .
		 *   2 x 9 =18
		 *   Gọi số đầu là a và số thứ 2 là b
		 *   ----------
		 *   ...
		 *   9 x 9 = 81
		 *   */
		for (int i = 2; i <= 9; i++) {// chạy vong lặp của số a bắt đầu bằng 2 đến khi nhỏ hơn 9
			for (int j = 1; j <= 10; j++) {// chạy lồng vòng của số b trong vòng lặp của a từ 1 - 10
				System.out.println(i + "x" + j + " = " + (i*j));// in ra màn hình kết quả vd số a là 2 chạy với số b từ 1 - 10 khi 2 x 10 thì lặp lại a = 3 tiếp tục đến khi a = 9
			}
			System.out.println("----------");// In ra ngăn cách của vòng lặp khi hết một vòng sẽ có dấu ngăn cách cho dễ nhìn 
		}
	}
}
