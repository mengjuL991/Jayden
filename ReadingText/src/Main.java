import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void getIndex(String word, ArrayList<String> sentences){
        int counter = 0;
        for (String s : sentences) {

            String[] array = s.split(" ", 0);

            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(word)) {
                    System.out.println("I FOUND A MATCH!!!! at index " + counter + ", " + i);
                }
            }
            counter++;
        }
    }

    public static void main(String[] args) throws IOException {
	    ArrayList<String> sentences = new ArrayList<>();
        FileReader fileReader = new FileReader("ProgrammingHistory.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String sentence;
        while ((sentence = bufferedReader.readLine()) != null) {
            sentences.add(sentence);
        }

        getIndex("were", sentences);
    }
}
