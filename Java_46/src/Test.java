import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		System.out.println("Kiểm tra câu a:");
		MayTinhCasioFX500 mt1 = new MayTinhCasioFX500();
		MayTinhVinaCal500MS mt2 = new MayTinhVinaCal500MS();
		System.out.println("Phép cộng: " + mt1.cong(1, 1));
		System.out.println("Phép trừ: " + mt1.tru(10, 8));
		System.out.println("Phép nhân: " + mt1.nhan(3, 4));
		System.out.println("Phép chia: " + mt1.chia(6, 3));
		System.out.println("-----------------------------");
		System.out.println("Phép cộng: " + mt2.cong(1, 1));
		System.out.println("Phép trừ: " + mt2.tru(10, 8));
		System.out.println("Phép nhân: " + mt2.nhan(3, 4));
		System.out.println("Phép chia: " + mt2.chia(6, 3));
		System.out.println("Kiểm tra câu b:");
		double[] arr1 = new double[] { 1, 5, 3, 7, 9, };
		double[] arr2 = new double[] { 4, 2, 8, 6, 10 };

		SapXepChen sapXepChen = new SapXepChen();
		SapXepChon sapXepChon = new SapXepChon();

		sapXepChen.sapXepTang(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		sapXepChon.sapXepTang(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println("---------------");
		System.out.println("Kiêm tra câu c: ");
		double[] arr3 = new double[] {1,4,0,2,9,8};
		PhanMemMayTinh pm1 = new PhanMemMayTinh();
		pm1.sapXepTang(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		pm1.sapXepGiam(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
			
		}
	
	}
}
