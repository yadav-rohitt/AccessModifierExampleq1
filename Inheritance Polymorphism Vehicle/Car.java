public class Car extends Vehicle {
    // Additional instance variable for Car
    private int numberOfDoors;

    // Constructor to initialize all instance variables
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // Call to the parent class constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Getter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // Setter for numberOfDoors
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Override the displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to the parent class method
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    // Override the startEngine method
    @Override
    public void startEngine() {
        System.out.println("The car's engine is starting.");
    }
}