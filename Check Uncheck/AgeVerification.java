
public class AgeVerification {

    public static void verifyAge(int age) throws invalidAgeException {
        if (age < 18) {
            throw new invalidAgeException("Age must be 18 or older");  
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}