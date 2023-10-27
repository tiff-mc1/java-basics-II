package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Smith", 45, 555555555, 1000000);

        System.out.println(employee.speak());
    }
}
