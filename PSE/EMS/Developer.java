public class Developer extends Employee {
    private int codingHours;

    public Developer(int id, String name, String department, double baseSalary, int workingHours, int codingHours) {
        super(id, name, department, baseSalary, workingHours);
        this.codingHours = codingHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (codingHours * 50); // Assuming payment of $50 per coding hour
    }
}

