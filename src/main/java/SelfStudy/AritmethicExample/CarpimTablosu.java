package SelfStudy.AritmethicExample;

import java.util.Scanner;

public class CarpimTablosu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int num = scan.nextInt();
        if (num == 0) {
            System.out.println("sifirdan buyuk bir sayi giriniz");
        } else {
            for (int i = 0; i <= num; i++) {
                for (int j = 0; j <= num; j++) {
                    System.out.print(i + "*" + j + "=" + (i * j) + "  ");
                }
                System.out.println(" ");
            }
        }
    }
}
