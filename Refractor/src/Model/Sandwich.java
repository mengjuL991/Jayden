package Model;

public class Sandwich extends Items {
    public enum Size{
        SMALL(6.5), MEDIUM(8.0), LARGE(10.5);
        private double price;

        Size(double d){price = d;}
        double getPrice(){return price;}
    }

    Size size;

    public Sandwich(String name, Size size){
        super(name, size.getPrice());
        this.size = size;
    }

    public boolean equals(Object o){
        if (o instanceof Sandwich){
            Sandwich s = (Sandwich) o;
            return (getName() == s.getName() && getPrice() == s.getPrice());
        }
        return false;
    }

    @Override
    public double getPrice() {
        return size.getPrice();
    }
}
