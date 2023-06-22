
public class MainTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		mm.timMin(5, 6);
		System.out.println("Sô nhỏ nhất của 5,6 là: " + mm.timMin(5, 6));
		System.out.println("Sô nhỏ nhất của 5,5 & 6.6 là: " + mm.timMin(5, 6));
		System.out.println("Tổng của 14 & 2 là: " + mm.tinhTong(14, 2));
		double arr[] = new double [] {1,2,3,4,5};
		System.out.println("Tổng của mảng arr[1,2,3,4,5] là: " + mm.tinhTong(arr));
		
	}
}
