package Model;

public class Pasta extends Items {
    boolean isDelux;
    double price;

    public Pasta(String name, double price, boolean delux){
        super(name, price);
        this.price = price;
        isDelux = delux;
    }
    public String getName() {
        return super.getName();
    }

    public Boolean getIsDelux() {
        return isDelux;
    }

    public boolean equals(Object o) {
        if (o instanceof Pasta) {
            Pasta p = (Pasta) o;
            return (getName() == p.getName() && getPrice() == p.getPrice() && getIsDelux() == p.getIsDelux());
        }
        return false;
    }
    @Override
    public double getPrice() {
        if (isDelux){
            return this.price + 2;
        }else {
            return this.price;
        }
    }
}
