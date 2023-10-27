package Composition;

public class Main {
    public static void main(String[] args) {
        var myTable = new Table(4, 20, 10);

        float price = myTable.getPrice();
        System.out.println("$" + Float.toString(price));
    }
}
