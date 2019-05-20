import com.sun.jdi.ArrayReference;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 2; i < 11; i++) {
            map.put(i, Integer.toString(i));
        }
        map.put(1, "A");
        map.put(11, "J");
        map.put(12, "Q");
        map.put(13, "K");

        List<Card> deck = new ArrayList<>(54);

        for (int s = 1; s <= 10; s++) {
            deck.add(new NumberCard(s, "Spade", map.get(s)));
        }

        for (int s = 11; s <= 13; s++) {
            deck.add(new FaceCard(s, "Spade", map.get(s)));
        }

        for (int s = 1; s <= 10; s++) {
            deck.add(new NumberCard(s, "Heart", map.get(s)));
        }

        for (int s = 11; s <= 13; s++) {
            deck.add(new FaceCard(s, "Heart", map.get(s)));
        }

        for (int s = 1; s <= 10; s++) {
            deck.add(new NumberCard(s, "Club", map.get(s)));
        }

        for (int s = 11; s <= 13; s++) {
            deck.add(new FaceCard(s, "Club", map.get(s)));
        }

        for (int s = 1; s <= 10; s++) {
            deck.add(new NumberCard(s, "Diamond", map.get(s)));
        }

        for (int s = 11; s <= 13; s++) {
            deck.add(new FaceCard(s, "Diamond", map.get(s)));
        }


        Iterator<Card> iterator = deck.iterator();

        while (iterator.hasNext()){
            Card tempCard = iterator.next();
            System.out.println(tempCard);
        }


        Collections.sort(deck);

        System.out.println("FINISHED SORTING");

        Iterator<Card> iterator2 = deck.iterator();

        while (iterator2.hasNext()){
            Card tempCard = iterator2.next();
            System.out.println(tempCard);
        }


        DescendingCompartor d = new DescendingCompartor();
        Collections.sort(deck, d);

        System.out.println("FINISHED SORTING 2");

        Iterator<Card> iterator3 = deck.iterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }


    }
}
