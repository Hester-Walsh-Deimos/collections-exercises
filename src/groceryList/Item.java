package groceryList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Item {
    public String name;
    public String category;
    public int quantity;

    public Item(String category, String name, int quantity) {
        this.category = category;
        this.name = name;
        this.quantity = quantity;
    }

    public static Comparator<Item> compareName = new Comparator<Item>() {
        @Override
        public int compare(Item o1, Item o2) {

            int value1 = o1.category.compareTo(o2.category);
            if (value1 != 0) {
                return value1;
            }
            return o1.name.compareTo(o2.name);

        }
    };
}
