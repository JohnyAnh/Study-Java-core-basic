import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		int n =1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("nhập n > 0");
			n = sc.nextInt();
					
		} while (n <= 0);
	}
}
