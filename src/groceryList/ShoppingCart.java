package groceryList;
import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingCart {
    static ArrayList<Item> cart = new ArrayList<>();

    public static void addItem(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n1: Meats\n2: Dairy\n3: Produce\n4: Other\n");
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("What meat product do you want to buy?");
            input.nextLine();
            String itemName = input.nextLine();
            System.out.printf("How many %s do you want to buy?", itemName);
            int itemQuantity = input.nextInt();
            Item meat = new Item("Meat", itemName, itemQuantity);
            cart.add(meat);

        } else if (option == 2) {
            System.out.println("What dairy product do you want to buy?");
            input.nextLine();
            String itemName = input.nextLine();
            System.out.printf("How many %s do you want to buy?", itemName);
            int itemQuantity = input.nextInt();
            Item dairy = new Item("Dairy", itemName, itemQuantity);
            cart.add(dairy);

        } else if (option == 3) {
            System.out.println("What produce product do you want to buy?");
            input.nextLine();
            String itemName = input.nextLine();
            System.out.printf("How many %s do you want to buy?", itemName);
            int itemQuantity = input.nextInt();
            Item produce = new Item("Produce", itemName, itemQuantity);
            cart.add(produce);

        } else if (option == 4) {
            System.out.println("What other product do you want to buy?");
            input.nextLine();
            String itemName = input.nextLine();
            System.out.printf("How many %s do you want to buy?", itemName);
            int itemQuantity = input.nextInt();
            Item other = new Item("Other", itemName, itemQuantity);
            cart.add(other);
        }
        System.out.println("Do you want to add another item?");
        input.nextLine();
        String yesNo = input.nextLine();
        if (yesNo.equalsIgnoreCase("yes")){
            addItem();
        } else {
            System.out.println("# | Name | Category" );
            for (Item item : cart){
                System.out.printf("\n%d - %s - %s", item.quantity, item.name, item.category);
            }

        }
    }


    public static void main(String[] args) {
        System.out.println("Do you want to create a grocery list?");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        boolean wantsToContinue = true;
        while (wantsToContinue) {
            if (choice.equalsIgnoreCase("yes")) {
                addItem();
            }else {
                wantsToContinue = false;
            }
        }


    }
}