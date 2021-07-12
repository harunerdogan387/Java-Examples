package SelfStudy.AritmethicExample;

import java.util.ArrayList;
import java.util.Scanner;

public class AsalSayi_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ogrenmek istediginiz araliktaki asal sayilar icin birinci sayi giriniz");
        int sayac1 = scan.nextInt();
        System.out.println("Lutfen ikinci sayi giriniz");
        int sayac2 = scan.nextInt();
        int sayi, count, temp;
        ArrayList<Integer> primeNumber = new ArrayList<>();
        ArrayList<Integer> otherNumber = new ArrayList<>();
        ArrayList<Integer> specialNumber = new ArrayList<>();
        if(sayac1>sayac2){
            temp=sayac1;
            sayac1=sayac2;
            sayac2=temp;
        }
        for (int j = sayac1; j <= sayac2; j++) {
             count = 0;
             sayi=j;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    count++;
                }
            }
            if(count==0){
                if(sayi==0||sayi==1||sayi==2){
                    //System.out.println(sayi+ " matematikte ozel sayidir asal olarak kabul edilmez");
                    specialNumber.add(sayi);
                }else {
                    //System.out.println(sayi + " asal sayidir");
                    primeNumber.add(sayi);
                }
            }else{
                //System.out.println(sayi+" asal sayi degildir");
                otherNumber.add(sayi);
            }

        }
        //System.out.println(specialNumber+" matematikte ozel sayidir asal olarak kabul edilmez");
        System.out.println(sayac1 +" ile " + sayac2 + " arasindaki " + primeNumber + " sayilari asal sayidir");
        System.out.println(sayac1 +" ile " + sayac2 + " arasinda "+primeNumber.size()+" tane prime number vardir.");
        System.out.println(primeNumber.get(primeNumber.size()-1) +" "+ sayac1 +" ile " + sayac2 + " arasindaki en buyuk asal sayi sayidir");
        //System.out.println(sayac1 +" ile "  + sayac + " arasindaki " + otherNumber + " sayilari asal sayi degildir");
    }
}
