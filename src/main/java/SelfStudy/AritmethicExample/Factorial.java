package SelfStudy.AritmethicExample;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int num) {
        int facto = 1;
        for (int i = 1; i <= num; i++) {
            facto *= i;
        }
        return facto;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int der = scan.nextInt();
        int result = factorial(der);
        System.out.println("factorial of the entered number= "+result);

    }
}
