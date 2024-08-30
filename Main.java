// Define a class named "Car"

class Car {

    // Fields/Attributes
    String color;
    String model;
    int year;

    // Constructor
    Car(String c, String m, int y) {
        color = c;
        model = m;
        year = y;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

// Main class to run the program
public class Main {

    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("White", "Tata curvvv ", 2024);

        // Call the method to display car details
        myCar.displayDetails();
    }
}
