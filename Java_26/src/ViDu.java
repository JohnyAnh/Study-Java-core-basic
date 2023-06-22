
public class ViDu {
	// Trường hợp không sử dụng label
//	public static void main(String[] args) {
//		int out, in = 0;
//		for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10) {
//					break;
//				}
//			}
//			System.out.println("bên trong vòng lặp out: out =" + out + ", in = " + in);
//		}
//		System.out.println("bên ngoài vòng lặp out = " + out + ", in = " + in);
//	}

// Trường hợp sử dụng label
//	public static void main(String[] args) {
//		int out, in = 0;
//	outer:	for (out = 0; out < 10; out++) { // label từ khóa có dấu : (outer)
//			for (in = 0; in < 20; in++) {
//				if (in > 10) {
//					break outer;// break thêm outer
//				}
//			}
//			System.out.println("bên trong vòng lặp out: out =" + out + ", in = " + in);
//		}
//		System.out.println("bên ngoài vòng lặp out = " + out + ", in = " + in);
//	}

	// Continue Unlabeled
//	public static void main(String[] args) {
//		int max = 100;
//		for (int i = 0; i < max; i++) {
//			if (i < 50)
//				continue;
//			System.out.println(i);// in ra thì câu lệnh continue bỏ qua từ 0-49 khi đến 50 thì in đến 99
//		}
//	}

	// Continue labeled
//	public static void main(String[] args) {
//		outer: for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 10; j++) {
//				if (j > 5)
//					continue outer;// bỏ qua vòng ngoài hoặc câu lệnh bên dưới
//				System.out.println(i + " x " + j + " = " + (i * j));
//			}
//			System.out.println("---");
//		}
//	}

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {
				if (j > 5)
					return;// ngưng lại dòng code dùng chương trình luôn
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println("---");
		}
		System.out.println("ABC");
	}
}
