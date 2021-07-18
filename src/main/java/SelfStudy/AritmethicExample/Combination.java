package SelfStudy.AritmethicExample;

import java.util.Scanner;

import static SelfStudy.AritmethicExample.Factorial.factorial;

public class Combination {
    public static int combination(int num1, int num2) {
        int combi=1;
        if (num1>=num2) {
            combi=factorial(num1)/(factorial(num2)*factorial(num1-num2));
        }else{
            combi=factorial(num2)/(factorial(num1)*factorial(num2-num1));
        }
        return combi;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = combination(num1,num2);
        System.out.println("factorial of the entered number= "+result);

    }
}
