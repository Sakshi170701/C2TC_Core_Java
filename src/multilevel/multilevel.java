package multilevel;

class LivingThings{
	void walk() {
		System.out.println("Walking...");
	}
}

class Animal1 extends LivingThings{
	void eat() {
		System.out.println("Eating....");
	}
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("Barking");
	}
}

public class multilevel {
	public static void main(String[] args) {
		Dog1 dg = new Dog1();
		dg.bark();
		dg.eat();
		dg.walk();

	}
}