import java.util.Scanner;

public class ChuyeDoi {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên n > 0");
		n = sc.nextInt();
		String nhiPhan = "";
		while (n>0) {
			nhiPhan = (n % 2) + nhiPhan;
			n = n/2;
		}
		System.out.println("Số ở nhị phân: " + nhiPhan);

		
		/*
		 * Chia liên tục cho 2 lấy dư 
		 * đảo ngược chuỗi => kết quả
		 * 
		 * 10 : 2 = 5 dư 0
		 * 5 : 2 = 2 dư 1
		 * 2 : 2 = 1 dư 0
		 * 1 : 2 = 0 dư 1
		 * 0
		 * 1 + 0
		 * 0 + 1 + 0
		 * 1 + 0 + 1 + 0 
		 * KQ 1010	
		 * */
	}
}
