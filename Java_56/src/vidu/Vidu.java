package vidu;

import java.util.Arrays;

public class Vidu {
	public static void main(String[] args) {
		String s = "Hom nay, hoa no rat dep";
		String[] a = s.split(" ");// Cắt chuỗi thành mảng từng phần theo khoảng trống hoặc bất cứ cái gì có trong mảng
		System.out.println(Arrays.toString(a));// => [Hom, nay,, hoa, no, rat, dep]
		String[] b = s.split(",");// Cắt chuỗi thành mảng theo dấu ","
		System.out.println(Arrays.toString(b));//=> in mảng b kết quả:[Hom nay,  hoa no rat dep]
		String s1 = "Xin chào, mọi người. Tôi là lập trình viên Hoàng Anh";
		String[] c = s1.split("\\.|\\,");// Cắt chuỗi thành mảng dựa trên cả dấu '.' và ','
		System.out.println(Arrays.toString(c));// in mảng c kết quảL: [Xin chào,  mọi người,  Tôi là lập trình viên Hoàng Anh]
		//Cắt chuỗi s1 lấy tên Anh
		String[] d = s1.split(" ");
		System.out.println(Arrays.toString(d));//in mảng d
		System.out.println("Tên: " + d[d.length-1]);// in ra phần tử cuỗi cùng của mảng d//=> Tên: Anh
		
		
	}
}
