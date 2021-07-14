package SelfStudy.AritmethicExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int inputNum = scan.nextInt();
        int num;
        int total = 0;
        int numPower = 1;
        ArrayList<Integer> armstrong = new ArrayList<>();
        ArrayList<Integer> notArmstrong = new ArrayList<>();
        for (int m = 0; m <= inputNum; m++) {
            num = m;
            String str = "" + num;
            int bs = str.length();
            int arr[] = new int[bs];
            for (int i = 0; i < bs; i++) {
                arr[i] = Integer.parseInt(str.substring(i, i + 1));
            }
            for (int i = 0; i < bs; i++) {
                for (int j = 0; j < bs; j++) {
                    numPower *= arr[i];
                }
                total += numPower;
                numPower = 1;
            }
            if (num == total) {
                armstrong.add(num);
            } else {
                notArmstrong.add(num);
            }
            scan.close();

            total = 0;
            numPower = 1;

        }
        System.out.println("0 ile " + inputNum + " arasindaki " + armstrong + " sayilari armstrongdur");
        //System.out.println("0 ile " + sayac + " arasindaki " + notArmstrong + " sayilari armstrong degildir");
    }


}
