package notes.example_generic_type;

import java.util.Arrays;

public class Box {

    private Object[] items;
    private int size;

    public Box() {
        this.items = new Object[4];
        this. size = 0;
    }

    public Object[] getItems() {
        return items;
    }

    public void addObject(Object item) {
        items[size++] = item;
    }

    public void display() {
        for (Object o : items) {
            System.out.println(((Car)o).getName());
        }
    }
}
