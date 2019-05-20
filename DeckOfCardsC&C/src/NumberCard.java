public class NumberCard extends Card{
    String displayValue;

    NumberCard(int value, String suit, String displayValue){
        super(value, suit);
        this.displayValue = displayValue;
    }

    public String toString(){
        return suit + " " + displayValue;
    }
}
