package Encapsulation;

public class Employee extends Person {
    private int salary;

    public Employee(String firstName, String lastName, byte age, int ssn, int salary) {
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String speak() {
        return "Name and Salary: " + getFirstName() + " " + getLastName() + ", $" + this.salary;
    }
}
