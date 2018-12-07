import java.util.ArrayList;

public class IntegerSet {
    ArrayList<Integer> mySet;

    // Make Constructor
    public IntegerSet() {
        mySet = new ArrayList<>();
    }

    public boolean contains(int i) {
        if (mySet.contains(i)){
            return true;
        } else{
            return false;
        }
    }

    public boolean isEmpty() {
        if (mySet.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(int i) {
        if (mySet.contains(i)){

        } else{
            mySet.add(i);
        }
    }

    public int size() {
        return mySet.size();
    }
}