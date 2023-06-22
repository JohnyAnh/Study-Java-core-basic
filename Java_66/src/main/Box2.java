package main;

public class Box2<T> {
	private T valueT;

	public Box2(T valueT) {
		this.valueT = valueT;
	}

	/**
	 * @return the valueT
	 */
	public T getValueT() {
		return valueT;
	}

	/**
	 * @param valueT the valueT to set
	 */
	public void setValueT(T valueT) {
		this.valueT = valueT;
	}
	
}
