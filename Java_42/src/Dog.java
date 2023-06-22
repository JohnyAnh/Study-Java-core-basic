public class Dog extends Animal {
	public Dog() {
		super("Dog");
	}
// Tạo override chọn source-> Override/Implement
	@Override
	public void eat() {
		System.out.println("Dog eats Beef");
	}

	@Override
	public void makeSound() {
		System.out.println("Gau Gau");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
	
}
