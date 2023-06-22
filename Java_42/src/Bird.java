public class Bird extends Animal {
	public Bird(){
		super("Bird");
	}
	//Override

	@Override
	public void eat() {
		System.out.println("Bird eats worm");
	}

	@Override
	public void makeSound() {
		System.out.println("Toe toe");
	}

	@Override
	public void sleep() {
		System.out.println("Bird is sleeping");
	}
	
}
