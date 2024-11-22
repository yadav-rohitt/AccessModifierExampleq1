public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        
        Employee manager = new Manager(101, "Singh Abhi", "HR", 80000, 160, 20);
        Employee developer = new Developer(102, "Patil Vishal", "IT", 70000, 150, 120);
        Employee hr = new HR(103, "Rohan Desai", "HR", 60000, 160, 100);

        company.addEmployee(manager);
        company.addEmployee(developer);
        company.addEmployee(hr);

        company.listEmployees();

       
        manager.calculateSalary();
        developer.calculateSalary();
        hr.calculateSalary();

        
        company.promoteEmployee(manager);

        
        try {
            Employee foundEmployee = company.findEmployeeById(102);
            System.out.println("Employee Found:");
            foundEmployee.displayEmployee();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
