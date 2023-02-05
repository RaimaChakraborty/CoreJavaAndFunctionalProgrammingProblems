package com.corefunctions;
import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {

        int dividend , divisor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a dividend :");
        dividend = scanner.nextInt();
        System.out.println("Enter a divisor :");
        divisor = scanner.nextInt();


        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
