package Q3;

public class Shape {
    
    
    public int area(int side) {
        return side * side;
    } 
    public int area(int length, int breadth) {
        return length * breadth;
    }
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

      
        System.out.println("Area of square: " + shape.area(4)); 
        System.out.println("Area of rectangle: " + shape.area(5, 3));
        System.out.println("Area of circle: " + shape.area(2.5)); 
    }
}
