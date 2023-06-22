
public class MyDate {
	private int day, month, year;
// Contructor
	public MyDate(int day, int month, int year) {
		if (day >=1 && day <=31) {
			this.day = day;
		}else {
			this.day = 14;
		}
		if (month >= 1 && month <= 12) {
			this.month = month;
		}else {
			this.month = 2;
		}
		if (year >= 1) {
			this.year = year;
		}else {
			this.year = 1998;
		}
	}
	// Get Set
	// Ham set tra ve gia tri phai co return
	public int getDay() {
		return this.day;
	}
	public void setDay(int d) {
		// Điều kiện cho d phải lớn hơn bằng 1 và nhỏ hơn bằng 31 không thì trả về giá trị cũ thảo mãn 
		if (d >= 1 && d <=31) {
			this.day = d;
		}
	}
	
	public int getMonth() {
		return this.month;
	}
	public void setMonth(int m) {
		if (m >= 1 && m<= 12) {
			this.month = m;
		}
	}
	
	public int getYear() {
		return this.year;
	}
	public void setYear(int y) {
		if (y >= 1) {
			this.year = y;
		}
	}
}
