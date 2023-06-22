
public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(14, 02, 2023);
		MyDate md2 = new MyDate(30, 10, 2023);
		MyDate md3 = new MyDate(14, 02, 2023);
//		int a = 5;
//		int b = 6;
//		if(a==b) {
//			System.out.println("a = b");
//		}else {
//			System.out.println("a != b");
//		}
		// LƯU Ý KHÔNG KHÔNG THỂ SO SÁNH 2 ĐỐI TƯỢNG QUA BẰNG BẰNG (==) ĐƯỢC 
//		if(md1==md3) {
//			System.out.println("md1 == md3");
//		}else {
//			System.out.println("md1 != md3");
//		}
		// Dùng hàm equals để so sánh 2 đối tượng với nhau
		System.out.println("md1 so sánh bằng md2" + md1.equals(md2));
		System.out.println("md1 so sánh bằng md3" + md1.equals(md3));
		System.out.println("md2 so sánh bằng md2" + md2.equals(md3));
		
		// Dùng hàm Hashcode
		System.out.println("Hashcode md1: " + md1.hashCode());
		System.out.println("Hashcode md2: " + md2.hashCode());
		System.out.println("Hashcode md3: " + md3.hashCode());
		
		
	}
}
