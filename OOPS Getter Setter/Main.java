public class Main {
    public static void main(String[] args) {
       
        Person person = new Person("Nikita", 21, 'F');
        person.displayInfo();
        
        person.setName("Rohit");
        person.setAge(25);
        person.setGender('M');
        System.out.println("\nUpdated Person Info:");
        person.displayInfo();

      
        Rectangle rectangle = new Rectangle(5, 5);
        double area = rectangle.calculateArea();
        System.out.println("\nArea of Rectangle: " + area);
    }
}

