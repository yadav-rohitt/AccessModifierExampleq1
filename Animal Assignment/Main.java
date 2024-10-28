public class Main {
    public static void main(String[] args) {
       
        Dog myDog = new Dog("Scooby", 8);

        // Displaying information of the Dog (using inherited displayInfo method)
        myDog.displayInfo();

        // Demonstrating polymorphism by calling makeSound (will use Dog's implementation)
        myDog.makeSound();

        // Using encapsulation with getter and setter methods
        System.out.println("\nUsing encapsulation to modify Dog details:");
        myDog.setSpecies("Golden Retriever");
        myDog.setAge(10);
        
        // Display modified information using displayInfo
        myDog.displayInfo();
    }
}

