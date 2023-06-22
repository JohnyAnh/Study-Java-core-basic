
public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(14, 02, 2023);
		MyDate md2 = new MyDate(30, 10, 2023);
		MyDate md3 = new MyDate(15, 06, 2023);
		// thay đổi thử gtri md3 bằng set
		md3.setDay(30);
		md3.setMonth(10);
		md3.setYear(1996);
		
		System.out.println(md1);// => 14 / 2/ 2023
		System.out.println(md2);
		System.out.println(md3);// old 15/6/2023 => 30/10/1996
	}
}
