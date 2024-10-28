public class Dog extends Animal {
    // Constructor for Dog that calls the parent class (Animal) constructor
    public Dog(String species, int age) {
        super(species, age);
    }

    // Overridden method to demonstrate polymorphism
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}