package practice_problem_03;

import java.util.*;
public class reverse
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("How many numbers will you enter ?");
        int n = obj.nextInt();

        System.out.println("Enter "+ n + " number:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]= temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}