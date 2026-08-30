import java.util.*;

public class program957
{
    public static void main(String A[])
    {
        HashMap <Integer, Integer> inventory = new HashMap<>();

        // ADD 101 50
        inventory.put(101, 50);

        // ADD 102 30
        inventory.put(102,30);

        // SELL 101 5
        if(inventory.containsKey(101))
        {
            inventory.put(101, inventory.get(101) - 5);
        }

        // RESTOCK 102 20
        if(inventory.containsKey(102))
        {
            inventory.put(102, inventory.get(102) + 20);
        }

        int productId = 101;

        // Product 101 avaialable quantity : 45
        if(inventory.containsKey(productId))
        {
            System.out.println("Product " + productId + " avaialable quantity : " + inventory.get(productId));
        }
        else
        {
            System.out.println("No such product available");
        }
    }
}
