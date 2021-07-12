package SelfStudy.StringMethodsExample;

import java.util.Scanner;

public class GetOnlyDuplicateCharInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input one word: ");
        String word = scan.next();
        word = word.toLowerCase();

        System.out.println(getOnlyDupValues(word));
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
    // Take a String and return only duplicate values

    public static String getOnlyDupValues(String str) {

        String unique = "";

        for(int i = 0 ; i < str.length(); i++) {

            if(!unique.contains(str.substring(i, i+1)) && freqOfChar(str, str.charAt(i)) > 1) {
                unique += "" + str.charAt(i)+" ";
            }
        }

        return unique;
    }
}
