public class Animal {
   
    private String species;
    private int age;

    // Default Constructor 
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    // Getter setter for species
    public String getSpecies() {
        return species;
    }
     public void setSpecies(String species) {
        this.species = species;
    }

    // Getter setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display the animal's details
    public void displayInfo() {
        System.out.println("Species: " + getSpecies() + ", Age: " + getAge());
    }

    // Method to demonstrate polymorphism (default sound for animals)
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}