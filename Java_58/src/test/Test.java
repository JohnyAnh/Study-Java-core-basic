package test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//Hàm lấy thời gian hiện tại System.currentTimeMillis()
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("Test" + i);
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Thời gian chạy vòng lặp: " + (t2-t1) + "mls");//=>5mls
		System.out.println("Thời gian chạy vòng lặp: " + ((t2-t1)/1000) + "s");//=>0s
		System.out.println("--------------------------------");
		// Hàm timeUnti() chuyển đổi đơn vị thời gian
		System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000*365)+ " s ");//=>3000 năm = 94608000000 s 
		System.out.println("10000 giờ = " + TimeUnit.DAYS.toDays(1000/24) + "ngày" );//=>10000 giờ = 41ngày
		System.out.println("--------------------------------");
		//Hàm Date
		Date d = new Date(System.currentTimeMillis());//Lấy thời gian hiện tại
		System.out.println(d.getDate() + "/" + (d.getMonth()+1) + "/" + (d.getYear()+1900));//=>10/4/2023
		System.out.println("--------------------------------");
		// Hàm Calendar
		Calendar c = Calendar.getInstance();//khai báo hàm Calendar
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1 ) + "-" + c.get(Calendar.YEAR));//=> ngày code 10-4-2023 lưu ý month + 1 tháng
		// Vì là lịch nên tăng giảm giờ hay bất kể gì khi in nó sẽ cộng vào ra đúng ngày tương ứng
		c.add(Calendar.HOUR, 24);// tăng 30 giờ thì sẽ thêm 1 ngày
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1 ) + "-" + c.get(Calendar.YEAR));//=> 11-4-2023
		// thêm ngày còn giảm đặt dấu trừ trước thông số 
		c.add(Calendar.DATE, 14);
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1 ) + "-" + c.get(Calendar.YEAR)); // thêm 14 => ngày 25-4-2023
		c.add(Calendar.DATE, -14);
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1 ) + "-" + c.get(Calendar.YEAR)); // giảm 14 => ngày 11-4-2023
		//DateFormat hàm chỉnh hiển thị theo ý mình
		DateFormat dFormat = new SimpleDateFormat();
		System.out.println(dFormat.format(d));//=>21:17, 10/04/2023|| lấy d ở trên lúc khai báo d trên Date
		// Tạo kiểu riêng
		dFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(dFormat.format(d));//=>10-04-2023 21:20:52
	}
}
