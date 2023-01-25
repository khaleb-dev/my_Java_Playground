package employee;

public class Employee {
    private String surName;
    private String firstName;
    private double salary;
    private double tax = 0.05;

    public Employee(String surName, String firstName, double salary) {
        this.surName = surName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
