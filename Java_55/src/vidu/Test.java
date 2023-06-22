package vidu;

import java.util.Arrays;
import java.util.Iterator;

public class Test {
	// Hàm đảo ngược
	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 2, 6, 4, 3, 7, 9 };
		int[] b = new int[15];
		// Hàm tìm kiếm trước khi sắp xếp
		System.out.println(Arrays.binarySearch(a, 4));// =>-2 sai giải thích dòng 13
		System.out.println(Arrays.binarySearch(a, -1));// =>-1 đúng
		// Arrays.binarySearch chỉ tìm kiếm được trong một mảng đã sắp xếp tăng dần rồi
		//
		System.out.println("a ban đầu: " + Arrays.toString(a));
		// Hàm sắp xếp tăng dần
		Arrays.sort(a);
		System.out.println("a sau khi sắp xếp: " + Arrays.toString(a));
		// Hàm tìm kiếm sau khi sắp xếp
		System.out.println(Arrays.binarySearch(a, 4));// vị trí 3 đúng
		System.out.println(Arrays.binarySearch(a, -1));// -1 đúng vì không có trong mảng

		// Hàm điền giá trị
		Arrays.fill(b, 5); // tự điền vào mảng b 15 số 5
		System.out.println(Arrays.toString(b));// Hiển thị mảng b

		// Hàm sắp xếp giảm dần khi dùng hàm tạo đảo ngược reserse
		Arrays.sort(a);// sắp xếp tăng trước
		a = Test.reverse(a);//sau đó đảo ngược
		System.out.println("a sau khi sắp xếp đảo ngược: " + Arrays.toString(a));// Hiển thị đảo ngược

	}
}
