package SelfStudy.AritmethicExample;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static SelfStudy.AritmethicExample.BinomalCoefficients.binomalCoefficients;

public class PascalTriangle {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("kacinci dereceye kadar binom sayilarini gormek istersiniz");
        int der=scan.nextInt();
        int num=0;
        for(int i=num; i<=der;i++) {
            List<Integer> arr1 = new ArrayList<>();
            arr1 = binomalCoefficients(i);
            System.out.println(arr1);
        }
    }
}
