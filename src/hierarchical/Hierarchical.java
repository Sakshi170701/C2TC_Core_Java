package hierarchical;

class LivingThings1 {
	void walk() {
		System.out.println("Walking...");
	}
}

class Animal2 extends LivingThings1 {
	void eat() {
		System.out.println("Eating....");
	}
}

class Dog2 extends LivingThings1 {
	void bark() {
		System.out.println("Barking");
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		Dog2 dg = new Dog2();
		dg.bark();
		
		dg.walk();

	}
}