package Practice;

abstract class Animal {
    abstract void sound();
    void sleep() {
        System.out.println("Sleeping...");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class AbstractionDemo {
	public static void main(String[] args) {
		Animal a= new Dog();
		a.sound();
		System.out.println(a.hashCode());
	}

}
