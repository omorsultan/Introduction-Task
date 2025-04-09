package practice_problem_03;

import java.util.Scanner;

public class prime
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = obj.nextInt();
        boolean check = false;
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
            {
                System.out.println("It is not a prime number.");
                check = true;
                break;
            }
        }
        if(check== false) System.out.println("The number is a prime number.");
    }
}
