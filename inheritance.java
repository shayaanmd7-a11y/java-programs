// Parent class (Superclass)
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class (Subclass)
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Call parent constructor
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks: Woof Woof!");
    }

    void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
}

// Main class named 'inheritance'
public class inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        myDog.eat();       // Inherited from Animal
        myDog.makeSound(); // Overridden in Dog
        myDog.fetch();     // Specific to Dog
    }
}