package practice_problem_03;

import java.util.Scanner;

public class oddEvenCount
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("How many numbers will you enter ?");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+ n +" number");
        int oddCount = 0;
        int evenCount = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
            if(arr[i]%2==0)evenCount++;
            else oddCount++;
        }
        System.out.println("There are "+evenCount+" even numbers.\n and "+oddCount+" odd numbers.");
    }
}
