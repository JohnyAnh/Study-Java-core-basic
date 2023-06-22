
public class MyDate {
	private int day, month, year;
	// contructor

	public MyDate(int day, int month, int year) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			this.day = 14;
		}
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			this.month = 2;
		}
		if (year >= 1) {
			this.year = year;
		} else {
			this.year = 1998;
		}
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 1) {
			this.year = year;
		}
	}
	
	// toString
	@Override
	public String toString() {
		return this.day +"/"+ this.month +"/"+ this.year;
	}

}
