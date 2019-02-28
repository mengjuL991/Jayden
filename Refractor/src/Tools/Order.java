package Tools;

import Model.Items;
import Tools.Time.Time;

import java.util.ArrayList;
import java.util.Timer;

public class Order {
    ArrayList<Items> customerOrder = new ArrayList<>();
    ArrayList<Items> restaurantInventory = new ArrayList<>();
    Time start;
    Time end;
    boolean out;
    boolean complete;

    public Order(ArrayList<Items> items, Restaurant restaurant, Time start) {
        customerOrder = items;
        restaurantInventory = restaurant.getInventory();
        // if not in inventory add 10 minutes to order
        for (int i = 0; i < customerOrder.size(); i++) {
            if (restaurantInventory.contains(customerOrder.get(i))) {
                this.start = start;
                end = new Time(start);
                for (int t = 0; t < 20; t++) {
                    end.tick();
                    out = false;
                    complete = true;
                }
            } else {
                this.start = start;
                end = new Time(start);
                for (int t = 10; t < 20; t++) {
                    end.tick();
                    out = true;
                    complete = false;
                }
            }
        }
    }

    public void deliveryInProgress(){
        out = true;
    }
    public void delivered () {
        complete = true;
    }
    public double getTotalPrice () {
        return 0;
    }
}
