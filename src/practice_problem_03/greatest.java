package practice_problem_03;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class greatest
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("How many numbers will you enter ?");
        int n = obj.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+ " number:");
        for(int i=0;i<n;i++)
        {
            arr[i]= obj.nextInt();
        }
        int ans = arr[0];
        for(int i=0;i<n;i++)
        {
            if(ans< arr[i])ans =arr[i];
        }
        System.out.println("The greatest number is: "+ans);
    }
}
