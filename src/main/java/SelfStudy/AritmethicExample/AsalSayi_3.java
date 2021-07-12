package SelfStudy.AritmethicExample;

import java.util.Scanner;

public class AsalSayi_3 {
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
            System.out.println(sayi+" asal sayi degildir");
            for(int w=1; w>0; w++){
            sayi++; //bunu kullanirsak sayiya en yakin sonraki asal sayiyi buluruz
            //sayi--; //bunu kullanirsak sayiya en yakin onceki asal sayiyi buluruz
            count=0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    count++;
                }
            }
            if(count==0){
                System.out.println(sayi+" girdiginiz sayidan sonraki ilk asal sayidir");
                //System.out.println(sayi+" girdiginiz sayidan onceki ilk asal sayidir");
                break;
            }else{
                continue;
            }
            }
            }
        //System.out.println(count == 0 ? "Sayi asal sayidir" : "Sayi asal sayi degildir");

    }
}

