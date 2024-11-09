public class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Calculate area of the rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Calculate perimeter of the rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(9, 7);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
    }
}

