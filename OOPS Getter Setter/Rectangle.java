class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea method
    @Override
    double calculateArea() {
        return length * width;
    }
}