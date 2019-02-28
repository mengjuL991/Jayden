package Tools;

import Model.Items;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private ArrayList<Customer> people = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Items> inventory = new ArrayList<>();

    public Restaurant(String name){
        this.name = name;
        makeFood();
    }

    public void makeFood(){
        for(int i = 0 ; i< 5;i++){
            makePizza();
            makePasta();
            makeSandwich();
        }
    }

    private void makePizza() {
        inventory.add(new Pizza("Pepperoni Pizza",3,false));
    }
    private void makePasta(){
        inventory.add(new Pasta("Meat Ball Pasta", 5,false));
    }
    private void makeSandwich(){
        inventory.add(new Sandwich("Peanut Butter", Sandwich.Size.SMALL));
    }

    public ArrayList<Items> getInventory() {
        return inventory;
    }

    public void addCustomer(Customer person) {
        people.add(person);
    }

    // What else do we need for getters?
}
