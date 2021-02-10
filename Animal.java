package testquestions;

class AnimalDemo {
	void shouts() {
		System.out.println("Animals Shout");
	}
}

class Dog extends AnimalDemo {
	void shouts() {
		System.out.println("Dogs Bark");
	}
}

class Horse extends AnimalDemo {
	void shouts() {
		System.out.println("Horses Neigh");
	}
}

class Cat extends AnimalDemo {
	void shouts() {
		System.out.println("Cats meow");
	}
}

public class Animal {
	public static void main(String[] args) {
		AnimalDemo dog = new Dog(); /* object of child class but reference variable of parent class */
		dog.shouts();

		AnimalDemo horse = new Horse();
		horse.shouts();

		AnimalDemo cat = new Cat();
		cat.shouts();
	}
}