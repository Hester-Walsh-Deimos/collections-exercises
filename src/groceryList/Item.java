package groceryList;
import java.util.ArrayList;
import java.util.Arrays;
public class Item {
    public String name;
    public String category;
    public int quantity;

    public Item(String category, String name, int quantity){
        this.category = category;
        this.name = name;
        this.quantity = quantity;
    }
}
