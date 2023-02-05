package com.corefunctions;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
            int num1, num2, temp;// num1 and num2 are to swap
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of two numbers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("Before swapping numbers: "+num1 +"  "+ num2);
            /*swapping */
            temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.println("After swapping: "+num1 +"   " + num2);
            System.out.println( );
        }
    }
