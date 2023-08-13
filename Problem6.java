package Problem6;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        int number1,number2,number3 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        if(number1 == number2 && number1 == number3 && number2 == number3)
        {
            System.out.println("All the same ");
        } else if (number1 != number2 && number1 != number3 && number2 != number3)
        {
            System.out.println("All different");
        } else
        {
            System.out.println("Neither");
        }
    }
}
