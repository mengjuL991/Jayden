package Model;

public class Pizza extends Items {
    boolean isDelux;


    public Pizza(String name, double price, boolean delux) {
        super(name, price);
        isDelux = delux;
    }

    public String getName(){
        return super.getName();
    }

    public Boolean getIsDelux() {
        return isDelux;
    }

    public boolean equals(Object o){
        if (o instanceof Pizza){
            Pizza p = (Pizza) o;
            return (getName() == p.getName() && getPrice() == p.getPrice() && getIsDelux() == p.getIsDelux());
        }
        return false;
        }

    public double getPrice() {
        if (isDelux) {
            return super.getPrice() + 3;
        } else {
            return super.getPrice();
        }
    }
}