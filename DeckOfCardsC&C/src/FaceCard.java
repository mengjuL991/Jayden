public class FaceCard extends Card {
    String displayValue;

    FaceCard(int value, String suit, String displayValue ){
        super(value, suit);
        this.displayValue = displayValue;
    }

    public String toString(){
        return suit + " " + displayValue;
    }
}

