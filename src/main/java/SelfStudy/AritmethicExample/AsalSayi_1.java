package SelfStudy.AritmethicExample;

import java.util.Scanner;

public class AsalSayi_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        int count = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                count++;
            }
        }
        if(count==0){
            System.out.println("Sayi asal sayidir");
        }else{
            System.out.println("Sayi asal sayi degildir");
        }
        //System.out.println(count == 0 ? "Sayi asal sayidir" : "Sayi asal sayi degildir");

    }
}
