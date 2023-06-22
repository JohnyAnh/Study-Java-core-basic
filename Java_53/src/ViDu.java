import java.lang.reflect.Array;
import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		// Kiểu nguyên thủy
		int[] mang1 = { 1, 2, 3, 4, 5 };

		// Cách 1 copy mảng kiểu này sẽ làm thay đổi giá trị ban đầu khi thay đổi giá
		// trị ở mảng sao chép
		int[] mang1_a = mang1;
		mang1_a[0] = 100;
		System.out.println("Mảng 1 dùng cách 1: " + Arrays.toString(mang1));// mảng 1 đã bị thay đổi khi mang1_a thay đổi giá trị
		System.out.println("Mảng 1_a dùng cách 1: " + Arrays.toString(mang1_a));

		// Cách 2 dùng hàm clone() để sao chép hàm này sao chép khi thay đổi giá trị sẽ
		// giữ nguyên
		int[] mang1_b = mang1.clone();
		mang1_b[0] = 14;
		System.out.println("Mảng 1 khi dùng hàm clone(): " + Arrays.toString(mang1));// vẫn giữ nguyên từ khi bị mang1_a
																						// thay đổi giá trị mới là [100,
																						// 2, 3, 4, 5]
		System.out.println("Mảng 1_b khi dùng hàm clone(): " + Arrays.toString(mang1_b));// Giữ nguyên mảng 1 khi thay
																							// đổi giá trị tại mang1_b
																							// [14, 2, 3, 4, 5]

		// Cách 3 dùng hàm System.arraycopy() tương tự hàm clone() nhưng hay hơn là copy
		// một phần của mảng
		int[] mang1_c = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		mang1_c[0] = 98;
		System.out.println("Mảng 1 khi dùng hàm System.arraycopy(): " + Arrays.toString(mang1));// vẫn giữ nguyên từ khi bị mang1_a
																						// thay đổi giá trị mới là [100,
																						// 2, 3, 4, 5]
		System.out.println("Mảng 1_c khi dùng hàm System.arraycopy(): " + Arrays.toString(mang1_c));// Giữ nguyên mảng 1 khi thay
																							// đổi giá trị tại mang1_b
																							// [14, 2, 3, 4, 5]
System.out.println("----------------------------------------------------------------------------");
		// Kiểu đối tượng
		String[] mang_doi_tuong = { "TITV", ".vn" };

		// Cách 1 copy mảng kiểu này sẽ làm thay đổi giá trị ban đầu khi thay đổi giá
		// trị ở mảng sao chép
		String[] mang_doi_tuong_a = mang_doi_tuong;
		mang_doi_tuong_a[0] = "HoangAnh";
		System.out.println("mang_doi_tuong dùng cách 1: " + Arrays.toString(mang_doi_tuong));// mảng 1 đã bị thay đổi khi mang1_a
																					// thay đổi giá trị
		System.out.println("mang_doi_tuong_a dùng cách 1: " + Arrays.toString(mang_doi_tuong_a));

		// Cách 2 dùng hàm clone() để sao chép hàm này sao chép khi thay đổi giá trị sẽ
		// giữ nguyên
		String[] mang_doi_tuong_b =  mang_doi_tuong.clone();
		mang_doi_tuong_b[1] = "đẹp zai";
		System.out.println("Mảng mang_doi_tuong khi dùng hàm clone(): " + Arrays.toString(mang_doi_tuong));
		System.out.println("Mảng mang_doi_tuong_b khi dùng hàm clone(): " + Arrays.toString(mang_doi_tuong_b));
		
		// Cách 3 dùng hàm System.arraycopy() tương tự hàm clone() nhưng hay hơn là copy
		// một phần của mảng
		String [] mang_doi_tuong_c = new String[mang_doi_tuong.length];
		System.arraycopy(mang_doi_tuong, 0, mang_doi_tuong_c, 0, mang_doi_tuong.length);
		mang_doi_tuong_c[1] = "siêu đẹp zai";
		System.out.println("Mảng mang_doi_tuong khi dùng hàm System.arraycopy(): " + Arrays.toString(mang_doi_tuong));
		System.out.println("Mảng mang_doi_tuong_b khi dùng hàm System.arraycopy(): " + Arrays.toString(mang_doi_tuong_c));
		
		
		
	}

}
