package com.corefunctions;
import java.util.Scanner;
public class PrimeFactors {
    // A function to print all prime factors
    // of a given number n
    public static void primeFactors(int number)
    {
        // Print the number of 2s that divide n
        while (number%2==0)
        {
            System.out.print(2 + " ");
            number /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(number); i+= 2)
        {
            // While i divides n, print i and divide n
            while (number%i == 0)
            {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (number > 2)
            System.out.print(number);
    }

    public static void main (String[] args)
    {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = scanner.nextInt();
        primeFactors(number);
    }
}
