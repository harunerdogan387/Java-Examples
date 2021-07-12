package SelfStudy.StringMethodsExample;

import java.util.Scanner;

public class FrequenceOfEachCharInWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input one word: ");
        String word = scan.next();
        word = word.toLowerCase();

        freqOfEachChar(word);
    }

    // freqency of chars
    // String, char   -> return how many times the char appear in the String
    // ("java", 'a')  -> 2
    public static int freqOfChar(String word, char letter) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    // We want to print how many times each char appears
    // apple
    // a - 1
    // p - 2
    public static void freqOfEachChar(String word) {
        String checked = "";
        for (int i = 0; i < word.length(); i++) {
            if (!checked.contains("" + word.charAt(i))) {
                int freq = freqOfChar(word, word.charAt(i));
                System.out.println(word.charAt(i) + " - " + freq);
                checked += word.charAt(i) + " ";
            }
        }
    }
}
