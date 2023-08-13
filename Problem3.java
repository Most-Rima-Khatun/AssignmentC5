package Problem3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        int number,countDigit ;
        countDigit = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        number = input.nextInt();
        number = Math.abs(number);
            while(number > 0)
            {
                countDigit = countDigit + 1;
                number = number / 10;
            }
        System.out.println(countDigit);
    }
}
