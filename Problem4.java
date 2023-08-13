package Problem4;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
       String name ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a nameri:");
        name  = input.next();
        if(name.charAt(0) == name.charAt(name.length()-1))
        {
            System.out.println("First and last is same ");
        }
        else
        {
            System.out.println("First and last is Different");
        }
    }
}
