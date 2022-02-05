package ArrayShoppingList;
import java.util.*;

// Ex 5.3 Pg 106
public class ShoppingItemsArray {
    public static void main(String[] args){
        ArrayList<ShoppingItems> shoppingItems = new ArrayList<ShoppingItems>();
        Scanner input = new Scanner(System.in);
        System.out.println("Type END to stop entering Items into the list");

        while (true){
            String item = input.next();

            switch (item) {
                case "END":
                    System.out.println("=== ITEMS ON LIST ====");
                    for(int i=0; i<shoppingItems.size(); i++){
                        shoppingItems.get(i).displayShoppingItems();
                    }

                    System.out.println("=== END OF LIST ====");
                    return;
            
                default:
                    shoppingItems.add(new ShoppingItems(item));
                    break;
            }
        }
    }
}
