package ZeroPositiveNegative;

import java.util.Scanner;

public class ZeroPositveNegative {
    public static void main(String[] args) {
        int number ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        number = input.nextInt();
        if(number > 0)
        {
            System.out.println("This Number Is POSITIVE number");
        }
        else if (number < 0)
        {
            System.out.println("This Number Is NEGATIVE number");
        }
        else
        {
            System.out.println("This Number Is ZERO");
        }
    }

}
