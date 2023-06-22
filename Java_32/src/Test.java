
public class Test {
	public static void main(String[] args) {
		MyDate md = new MyDate(14, 2, 1998);
		System.out.println("Day =" + md.getDay());
		md.setDay(31);
		System.out.println("Day =" + md.getDay());
		md.setDay(33);// sai điều kiện nên kết quả trả về gtri bên trên là 31
		System.out.println("Day =" + md.getDay());
		System.out.println("Month = " + md.getMonth());
		md.setMonth(10);
		System.out.println("Month = " + md.getMonth());
		System.out.println("Month = " + md.getYear());
		md.setYear(1996);
		System.out.println("Month = " + md.getYear());
	}
}
