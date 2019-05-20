public abstract class Card implements Comparable<Card> {
    int value;
    String suit;

    Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String toString() {
        return value + suit;
    }

    @Override
    public int compareTo(Card c) {
        if (this.value > c.value){
            return 1;
        }
        if (this.value < c.value) {
            return -1;
        }
        return 0;
    }
}