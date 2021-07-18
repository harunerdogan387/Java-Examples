package SelfStudy.AritmethicExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static SelfStudy.AritmethicExample.Combination.combination;

public class BinomalCoefficients {

    public static List<Integer> binomalCoefficients(int num) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0; i<=num; i++){
            arr.add(combination((num),i));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the degree of the equatian: ");
        int num=scan.nextInt();
        List<Integer> arr1=new ArrayList<>();
        arr1=binomalCoefficients(num);
        System.out.println("The coefficients of the equation you entered are respectively: "+arr1);

    }


}
