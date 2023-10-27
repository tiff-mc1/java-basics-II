package Encapsulation;

public class Person {
    private String firstName;
    private String lastName;
    private byte age;
    private int ssn;

    public Person(String firstName, String lastName, byte age, int ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    public void setSSN(int ssn) {
        this.ssn = ssn;
    }

    public void setage(byte age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public byte getAge() {
        return age;
    }
}