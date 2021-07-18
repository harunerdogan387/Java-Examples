package SelfStudy.AritmethicExample;

import java.util.Scanner;

public class TriangleWithStar_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int num = scan.nextInt();
        if (num == 0) {
            System.out.println("sifirdan buyuk bir sayi giriniz");
        } else {

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }for (int i = 1; i < num; i++) {
                for (int j = num-1; j >= i; j--) {
                    System.out.print("* ");
                }
                System.out.println("");
            }

        }
    }
}
