// Base class
class Corporate {
    // Field
    private String name;

    // Constructor
    public Corporate(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to make a sound
    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}

// Subclass
class Dog extends Corporate {
    // Constructor
    public Dog(String name) {
        super(name); // Call the constructor of the base class
    }

    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    // Method specific to Dog
    public void fetch() {
        System.out.println("The dog is fetching the ball.");
    }
}

// Main class to test inheritance
public class Main {
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal genericAnimal = new ("Generic Animal");
        System.out.println("Animal Name: " + genericAnimal.getName());
        genericAnimal.makeSound(); // Calls the method in Animal

        // Create an instance of Dog
        Dog myDog = new Dog("Rex");
        System.out.println("Dog Name: " + myDog.getName());
        myDog.makeSound(); // Calls the overridden method in Dog
        myDog.fetch();     // Calls the method specific to Dog
    }
}
