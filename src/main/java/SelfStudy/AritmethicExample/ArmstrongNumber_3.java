package SelfStudy.AritmethicExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input a number : ");
        int inputNum = scan.nextInt();
        int total = 0;
        int numPower = 1;
        int temp = inputNum;
        ArrayList<Integer> array = new ArrayList<Integer>();
        do{
            array.add(temp % 10);
            temp /= 10;
        } while  (temp > 0);
        for(int i=0; i< array.size(); i++){
            for(int j=0; j<array.size(); j++){
                numPower = numPower * array.get(i);
            }
            total+=numPower;
            numPower=1;
        }
        System.out.println("input Number is "+inputNum+" kuvvetler toplami is "+total);
        if ( inputNum== total) {
            System.out.println("it is Armstrong Number");
        } else {
            System.out.println("it is not Armstrong Number");
        }
    }
}
