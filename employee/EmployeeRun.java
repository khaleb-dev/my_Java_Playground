package employee;

public class EmployeeRun {
    public static void main(String[] args) {
        Employee employee = new Employee("Smith", "John", 1000);
        System.out.println(employee.getSurName());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getTax());
    }
}
