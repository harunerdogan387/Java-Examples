package SelfStudy.AritmethicExample;

import java.util.ArrayList;
import java.util.Scanner;

public class Armstrongnumber_WithPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input a number : ");
        int inputNum = scan.nextInt();
        double total = 0;
        int temp = inputNum;
        ArrayList<Integer> array = new ArrayList<Integer>();
        do {
            array.add(temp % 10);
            temp /= 10;
        } while (temp > 0);
        for(int i=0; i<array.size(); i++){
            total=total+Math.pow(array.get(i),array.size());
        }
        if ( inputNum== total) {
            System.out.println(inputNum+" is Armstrong Number");
        } else {
            System.out.println(inputNum+" is not Armstrong Number");
        }

    }
}
