package Problem7;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        int number1,number2,number3 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        if(number1 > number2 && number2 > number3)
        {
            System.out.println("Increasing ");
        } else if (number1 < number2 && number2 < number3)
        {
            System.out.println("Decreasing");
        } else
        {
            System.out.println("Neither");
        }
    }
}
