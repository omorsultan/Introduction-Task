package practice_problem_03;

import java.util.Scanner;

public class fibonacci
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        arr[0]=0;
        arr[1] = 1;
        for(int i=0;i<n;i++)
        {
            if(i>1)arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+" ");

        }
    }
}
