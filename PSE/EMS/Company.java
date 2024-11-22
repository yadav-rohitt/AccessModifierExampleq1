import java.util.ArrayList;

public class Company implements EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void listEmployees() {
        System.out.println("Employees in the Company:");
        for (Employee employee : employees) {
            employee.displayEmployee();
        }
    }

    public Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        throw new RuntimeException("EmployeeNotFoundException: Employee with ID " + id + " not found.");
    }

    @Override
    public void manageEmployee() {
        // Placeholder for company-specific employee management logic
    }

    @Override
    public void promoteEmployee(Employee employee) {
        System.out.println("Promoting Employee: " + employee.getName() + " to Senior " + employee.getDepartment());
    }
}
