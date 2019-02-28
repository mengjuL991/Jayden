package UI;

import Model.Items;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;
import Tools.Customer;
import Tools.Order;
import Tools.Restaurant;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Restaurant main = new Restaurant("Jayden's Den");
        //Try sample orders
        for (int i = 0; i < 10; i++) {
            System.out.println(main.getInventory().get(i).getName());
            System.out.println(main.getInventory().get(i).getPrice());
        }
        Restaurant fraserStreet = new Restaurant(("Jayden 2"));
        Customer Jayden = new Customer("Jayden", "1125 Connaught Drive");
        main.addCustomer(Jayden);

        ArrayList<Items> myOrder = new ArrayList<>();
        myOrder.add(new Pizza("Pepperoni Pizza", 3, false));
        myOrder.add(new Sandwich("Meatball Sandwich", Sandwich.Size.SMALL));

    }


}
