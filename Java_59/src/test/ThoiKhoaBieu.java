package test;

public class ThoiKhoaBieu {
	private Day thuDay;
	private String cacMonHoc;
	public ThoiKhoaBieu(Day thuDay, String cacMonHoc) {
		super();
		this.thuDay = thuDay;
		this.cacMonHoc = cacMonHoc;
	}
	public Day getThuDay() {
		return thuDay;
	}
	public void setThuDay(Day thuDay) {
		this.thuDay = thuDay;
	}
	public String getCacMonHoc() {
		return cacMonHoc;
	}
	public void setCacMonHoc(String cacMonHoc) {
		this.cacMonHoc = cacMonHoc;
	}
	@Override
	public String toString() {
		return "ThoiKhoaBieu [thuDay=" + thuDay + ", cacMonHoc=" + cacMonHoc + "]";
	}
	
		
	
}
