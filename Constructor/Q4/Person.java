package Q4;

public class Person {
    private String name;
    private int age;

    
    public Person() {
        this.name = "Rohit";
        this.age = 22;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
       
        Person person1 = new Person();
        person1.displayInfo(); 

        Person person2 = new Person("Abhi",20);
        person2.displayInfo(); 
    }
}

