package Problem5;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args)
    {
        String name ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name:");
        name  = input.next();
        String nameOfFirstHalf = name.substring(0,name.length()/2);
        String nameOfLastHalf;
        if(name.length() % 2 == 0)
            nameOfLastHalf = name.substring(name.length()/2,name.length());
        else
            nameOfLastHalf = name.substring(name.length()/2+1,name.length());

        System.out.println(nameOfFirstHalf);
        System.out.println(nameOfLastHalf);
        for(int i = 0;i<nameOfLastHalf.length();i++)
        {
            if(nameOfFirstHalf.charAt(i) != nameOfLastHalf.charAt(i))
            {
                System.out.println("First and last is Different");
                return;
            }

        }
            System.out.println("First and last is same");

    }
}
