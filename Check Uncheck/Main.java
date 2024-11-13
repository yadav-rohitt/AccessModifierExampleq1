

public class Main {
    public static void main(String[] args) {
        try {
           
            AgeVerification.verifyAge(22);  
         
            AgeVerification.verifyAge(17);  
        } catch (invalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());  
        }
    }
}