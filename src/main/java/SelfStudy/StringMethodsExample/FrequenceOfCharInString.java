package SelfStudy.StringMethodsExample;

import java.util.Scanner;

public class FrequenceOfCharInString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please, input one word: ");
        String word=scan.next();
        word=word.toLowerCase();
        System.out.println("Please, input one letter: ");
        String letter=scan.next();
        letter=letter.toLowerCase();
        char ch=letter.charAt(0);

        System.out.println("There are "+freqOfChar(word, ch)+" \""+ch+"\" in "+word+".");

        //metodu asagidaki gibi kullnsaydik ustteki satirlara gerek kalmadan word ve char girmemeiz yeterli olacakti
        //System.out.println(freqOfChar("bananana", 'z'));
    }

    // freqency of chars
    // String, char   -> return how many times the char appear in the String
    // ("java", 'a')  -> 2
    public static int freqOfChar (String word, char letter) {
        int count = 0;

        for(int i=0; i < word.length(); i++) {
            if(word.charAt(i)  == letter) {
                count++;
            }
        }
        return count;
    }
}
