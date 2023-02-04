package com.flipcoin;
import java.util.Scanner;

public class FlipCoinPercentage {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        int count = 1;
        double randum = 0.0;
        System.out.println("Enter no of flips : ");
        Scanner n = new Scanner(System.in);
        int flips = n.nextInt();

        while(count <= flips)
        {
            randum=Math.random();
            System.out.println("count" + " " + randum);
             if(randum < 0.5)

                 head++;


             else

                 tail++;

             count++;
        }
        System.out.println();
        System.out.println("Number of Heads: " + head);
        System.out.println("Number of Tails: " + tail);

        double headPercent = (double)head/flips*100;
                double tailPercent = (double)tail/flips*100;
        System.out.println("Percentage of getting Heads: " + headPercent);
        System.out.println("Percentage of getting Tails: " + tailPercent);
    }
}



