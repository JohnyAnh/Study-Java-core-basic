
public class Students {
	private int msSv;
	private String nameString;

	public Students(int msSv, String nameString) {
		this.msSv = msSv;
		this.nameString = nameString;
	}

	/**
	 * @return the msSv
	 */
	public int getMsSv() {
		return msSv;
	}

	/**
	 * @param msSv the msSv to set
	 */
	public void setMsSv(int msSv) {
		this.msSv = msSv;
	}

	/**
	 * @return the nameString
	 */
	public String getNameString() {
		return nameString;
	}

	/**
	 * @param nameString the nameString to set
	 */
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "Students [msSv=" + msSv + ", nameString=" + nameString + "]";
	}

}
