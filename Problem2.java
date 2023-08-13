package Problem2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        float number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        number = input.nextFloat();
        if (number > 0) {
            System.out.println("This Number Is POSITIVE number");
            if(number > 1 && number < 1000000)
            {
                System.out.println("This Number Is SMALL");
            }
            else if(number > 1000000)
            {
                System.out.println("This Number Is LARGE");
            }
        } else if (number < 0) {
            System.out.println("This Number Is NEGATIVE number");
        } else
        {
            System.out.println("This Number Is ZERO");
        }

    }
}
