package Q2;
public class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

   public static void main(String[] args) {
        
        int x = 10;
        int y = 5;
    
        System.out.println("Addition: " + MathOperations.add(x, y));         
        System.out.println("Subtraction: " + MathOperations.subtract(x, y)); 
        System.out.println("Multiplication: " + MathOperations.multiply(x, y)); 
    }
}

