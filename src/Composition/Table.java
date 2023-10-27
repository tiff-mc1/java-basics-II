package Composition;

import Abstraction.Billable;
import java.util.ArrayList;

public class Table implements Billable {
    private int width;
    private int length;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(int numLegs, int width, int length) {
        this.width = width;
        this.length = length;

        for (int i = 0; i < numLegs; i++) {
            legs.add(new Leg(this.length));
        }
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Float getPrice() {
        float price = (float) this.length * this.width;
        return price;
    }
}
