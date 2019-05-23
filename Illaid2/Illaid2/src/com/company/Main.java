package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        FileReader fr = new FileReader("in.txt");
        BufferedReader br = new BufferedReader(fr);

        HashSet<String> words = new HashSet<String>();

        String line;
        while ((line = br.readLine()) != null) {
//			System.out.println(line);
            String result;
            result = line.toUpperCase();
            result = result.replaceAll("[^a-zA-Z ]","");
//			System.out.println(result);
            String[] splitted = result.split("\\s+");

            for (int i = 0; i < splitted.length; i++) {
                words.add(splitted[i]);
//                System.out.println("I AM ADDING " + splitted[i]);
                if (splitted[i].equals(" ")) {
                    System.out.println(("MATCH"));
                }
            }
        }
        System.out.println(words);
        System.out.println("The number of unique words is " + words.size());

    }
}
