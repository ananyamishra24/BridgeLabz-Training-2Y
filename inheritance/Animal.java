// Superclass
class Animal {
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age); // calling superclass constructor
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the Dog says: Woof Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the Cat says: Meow Meow!");
    }
}

// Subclass Bird
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the Bird says: Tweet Tweet!");
    }
}

// Driver class
public class AnimalHierarchyDemo {
    public static void main(String[] args) {
        // Polymorphism: parent reference → child object
        Animal a1 = new Dog("Bruno", 3);
        Animal a2 = new Cat("Kitty", 2);
        Animal a3 = new Bird("Tweety", 1);

        // Each object calls its own overridden method
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
