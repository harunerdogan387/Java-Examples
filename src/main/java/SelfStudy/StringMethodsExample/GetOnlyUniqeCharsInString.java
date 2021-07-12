package SelfStudy.StringMethodsExample;

import java.util.Scanner;

public class GetOnlyUniqeCharsInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input one word: ");
        String word = scan.next();
        word = word.toLowerCase();

        System.out.println(getOnlyUniqueValues(word));
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
    // Take a String and return only unique values
    // aaaabbcdddefffg -> ceg

    public static String getOnlyUniqueValues(String str) {

        String unique = "";

        for(int i = 0 ; i < str.length(); i++) {

            // if we didn't have freqOfChar declared
            // the nested loop would be here

            if(freqOfChar(str, str.charAt(i)) == 1) {
                unique += "" + str.charAt(i)+" ";
            }
        }

        return unique;
    }
}
