public class ConNguoi {
	protected String hoVaStringTenString;
	protected int namSinh;
	public ConNguoi(String hoVaStringTenString, int namSinh) {
		this.hoVaStringTenString = hoVaStringTenString;
		this.namSinh = namSinh;
	}
	public String getHoVaStringTenString() {
		return hoVaStringTenString;
	}
	public void setHoVaStringTenString(String hoVaStringTenString) {
		this.hoVaStringTenString = hoVaStringTenString;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public void an() {
		System.out.println("Nhoam Nhoam");
	}
	public void uong() {
		System.out.println("uc uc");
	}
}
