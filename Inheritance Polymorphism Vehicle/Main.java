public class Main {
    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle myVehicle = new Vehicle("Kia", "Seltos", 2019);
        myVehicle.displayInfo();
        myVehicle.startEngine();

        // Create an instance of Car
        Car myCar = new Car("Honda", "Civic", 2022, 4);
        myCar.displayInfo();
        myCar.startEngine();

        // Demonstrate the use of getter and setter methods
        myVehicle.setMake("Ford");
        myVehicle.setModel("Mustang");
        myVehicle.setYear(2021);
        System.out.println("\nUpdated Vehicle Information:");
        myVehicle.displayInfo();
        
        // Change Car's details using setters
        myCar.setNumberOfDoors(2);
        System.out.println("\nUpdated Car Information:");
        myCar.displayInfo();
    }
}