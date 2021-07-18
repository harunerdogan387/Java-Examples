package SelfStudy.StringMethodsExample;

import java.util.Scanner;

public class LeadingZeros {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int num=scan.nextInt();
        String str=""+num;
        int length=str.length();
        System.out.println("how many digit of number");
        int digit=scan.nextInt();
        String strNum ="";

        if(digit>=length) {
            strNum = String.format("%0" + digit + "d", num);
            System.out.println("With leading zeros = " + strNum);
        }else{
            System.out.println("entered digit is  smaller than the number of digits");
        }
        //add ending "0"
        if(length>=digit) {
            System.out.println("entered digit is  smaller than the number of digits");

        }else{
            for(int i=0; i<(digit-length);i++){
                str=str+"0";
            }
            System.out.println("With ending zeros = " + str);
        }

        int begining=Integer.parseInt(strNum);
        System.out.println("begining:--> "+begining);
        int ending=Integer.parseInt(str);
        System.out.println("ending:--> "+ending);


    }
}
