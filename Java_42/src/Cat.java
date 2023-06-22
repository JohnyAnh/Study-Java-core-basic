public class Cat extends Animal {
	public Cat() {
		super("Cat");
	}
	// Override

	@Override
	public void eat() {
		System.out.println("Cat eats Fish");
	}

	@Override
	public void makeSound() {
		System.out.println("Meow Meow");
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping");
	}
	
}
