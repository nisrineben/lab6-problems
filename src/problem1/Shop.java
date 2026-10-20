package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            // *** create a new item and add it to the cart
            Item new_item=new Item(itemName,itemPrice,quantity);
            cart.add(new_item);
            // *** print the contents of the cart object using println
            for(Item it:cart){
                System.out.println(it.getName() + "\t" + it.getPrice() +" MAD" + "\t" + it.getQuantity()
                        + "\t total  price " + it.getQuantity()*it.getPrice()+" MAD");
            }
            System.out.print ("Continue shopping (y/n)? ");
            scan.nextLine();
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
