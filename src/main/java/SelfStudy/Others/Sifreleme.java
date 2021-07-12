package SelfStudy.Others;

import java.util.Arrays;
import java.util.Scanner;

public class Sifreleme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String name = scan.next();
        //name=name.toLowerCase();
        String[] words = new String[name.length()];
        for (int i = 0; i < name.length(); i++) {
            words[i] = (name.substring(i, i + 1));
        }
        System.out.println(Arrays.toString(words));
        char[] ch = new char[name.length()];
        int[] sayi = new int[name.length()];
        int toplam = 0;
        for (int i = 0; i < name.length(); i++) {
            ch[i] = name.charAt(i);
            sayi[i] = name.charAt(i);
            toplam += sayi[i];
        }
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(sayi));
        Arrays.sort(sayi);
        System.out.println(Arrays.toString(sayi));

        System.out.println("isminizin ascii degeri; " + toplam);

        String str = "";
        for (int i = 0; i < name.length(); i++) {
            str += Character.toString(sayi[i]);
        }
        System.out.println(str);
    }
}
