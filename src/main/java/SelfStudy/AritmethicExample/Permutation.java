package SelfStudy.AritmethicExample;

import java.util.Scanner;

import static SelfStudy.AritmethicExample.Factorial.factorial;

public class Permutation {
    public static int permutation(int num1, int num2) {
        int permo=1;
        if (num1>=num2) {
            permo=factorial(num1)/(factorial(num1-num2));
        }else{
            permo=factorial(num2)/(factorial(num2-num1));
        }
        return permo;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = permutation(num1,num2);
        System.out.println("factorial of the entered number= "+result);

    }

}
