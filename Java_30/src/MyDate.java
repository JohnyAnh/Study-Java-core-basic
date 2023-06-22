
public class MyDate {
	private int Day, Month, Year, Date;

	// Constructor!
	public MyDate(int d, int m, int y) {
		this.Day = d;
		this.Month = m;
		this.Year = y;
	}

	public void PrintDay() {
		System.out.println("Day: " + Day);
	}

	public void PrintMonth() {
		System.out.println("Month: " + Month);
	}

	public void PrintYear() {
		System.out.println("Year: " + Year);
	}

	public void PrintDate() {
		System.out.println("Day: " + Day);
		System.out.println("Month: " + Month);
		System.out.println("Year: " + Year);
		System.out.println("Date: " + Day + " / " + Month + " / " + Year);
	}

}
