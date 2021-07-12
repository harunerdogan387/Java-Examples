package SelfStudy.AritmethicExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayac = scan.nextInt();
        int sayi;
        int toplam = 0;
        int carpimKatsayisi = 1;
        ArrayList<Integer> armstrong = new ArrayList<>();
        ArrayList<Integer> notArmstrong = new ArrayList<>();
        for (int m = 0; m <= sayac; m++) {
            sayi = m;
            String str = "" + sayi;
            int bs = str.length();
            int arr[] = new int[bs];
            for (int i = 0; i < bs; i++) {
                arr[i] = Integer.parseInt(str.substring(i, i + 1));
            }
            for (int i = 0; i < bs; i++) {
                for (int j = 0; j < bs; j++) {
                    carpimKatsayisi *= arr[i];
                }
                toplam += carpimKatsayisi;
                carpimKatsayisi = 1;
            }
            if (sayi == toplam) {
                armstrong.add(sayi);
            } else {
                notArmstrong.add(sayi);
            }
            scan.close();

            toplam = 0;
            carpimKatsayisi = 1;

        }
        System.out.println("0 ile " + sayac + " arasindaki " + armstrong + " sayilari armstrongdur");
        //System.out.println("0 ile " + sayac + " arasindaki " + notArmstrong + " sayilari armstrong degildir");
    }
}
