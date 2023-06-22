public class Animal {
	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println(".....");
	}
	public void makeSound() {
		System.out.println("Cuu tui Cuu tui");
	}
	public void sleep() {
		System.out.println("zzZZ");
	}
}
