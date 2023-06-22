
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
	
	
	
	@Override
	// SEARCH Hàm băm wiki
	// Hàm băm (tiếng Anh: hash function) là giải thuật nhằm sinh ra các giá trị 
//	băm tương ứng với mỗi khối dữ liệu (có thể là một chuỗi ký tự, một đối tượng 
//	trong lập trình hướng đối tượng, v.v...). Giá trị băm đóng vai gần như một
//	khóa để phân biệt các khối dữ liệu, tuy nhiên, người ta chấp nhận hiện tượng trùng 
//	khóa hay còn gọi là đụng độ và cố gắng cải thiện giải thuật để giảm thiểu sự đụng độ đó.
//	Hàm băm thường được dùng trong bảng băm nhằm giảm chi phí tính toán khi tìm một khối dữ 
//	liệu trong một tập hợp (nhờ việc so sánh các giá trị băm nhanh hơn việc so sánh những
//	khối dữ liệu có kích thước lớn).
	public int hashCode() {
		final int prime = 31;
		// biến prime bằng 31
		int result = 1;
		// biến result bằng 1
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	// Khi so sánh 2 đối tượng thì phải trả về giá trị true of false
	// Đối tượng a và b có bằng nhau hay không
	public boolean equals(Object obj) {
		// khi so sánh lấy cái lớp đang đứng(Object obj) so sánh với đối tượng truyền vào
		// lớp Object đại diện cho đối tượng đại diện trong java ở đây đối tượng là obj
		if (this == obj)
			// kiểm tra nếu obj bằng với this là lớp này thì return bằng true
		// VD md1.equals(md1) đương nhiên là true
			return true;
		
		if (obj == null)
		// một đối tượng có thể có giá trị là null 
		// nếu đối tượng truyền vào bằng null(không có giá trị gì hết) thì return về false
		// Kiểu như không thể lấy bản thân nó đi so sánh với một giá null 
			return false;
		if (this.getClass() != obj.getClass())
		// Hiểu đơn giản 2 class hay lớp khác nhau thì return về false luôn
			// VD class MyDate và class Student
			return false;
		// Đầu tiên sẽ ép kiểu dữ liệu MyDate other = (MyDate) obj;
		// (MyDate) obj là obj đc ép kiểu MyDate
		MyDate other = (MyDate) obj;
		// Bên dưới là phép loại trừ
		if (this.day != other.day)
			// Nếu this.day không bằng (!=) other.day return false tương tự month và year
			return false;
		if (this.month != other.month)
			return false;
		if (this.year != other.year)
			return false;
		// sau khi lọc tất cả điều kiện kia không phạm vào hàm nào thì return về true
		return true;
	}

	// toString
	@Override
	public String toString() {
		return this.day +"/"+ this.month +"/"+ this.year;
	}
	
	

}
