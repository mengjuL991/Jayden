import java.util.Comparator;

public class DescendingCompartor implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2){
        if (c1.value > c2.value){
            return -1;
        }else if(c1.value < c2.value){
            return 1;
        }else {
            return -1;
        }
    }
}

