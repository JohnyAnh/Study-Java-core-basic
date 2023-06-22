public class Main {
	public static void main(String[] args) {
		Animal a = new Animal("Lop Dong Vat");
		a.eat();
		a.makeSound();
		a.sleep();
		System.out.println("----------------");
		Dog d = new Dog();
		d.eat();
		d.makeSound();
		d.sleep();
		System.out.println("----------------");
		Cat c = new Cat();
		c.eat();
		c.makeSound();
		c.sleep();
		System.out.println("----------------");
		Bird b = new Bird();
		b.eat();
		b.makeSound();
		b.sleep();
	}
}
