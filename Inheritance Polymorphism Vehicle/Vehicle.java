public class Vehicle {
    
    private String make;
    private String model;
    private int year;

   
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    public void displayInfo() {
        System.out.println("Vehicle Make: " + make);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Vehicle Year: " + year);
    }

   
    public void startEngine() {
        System.out.println("The vehicle's engine is starting.");
    }
}