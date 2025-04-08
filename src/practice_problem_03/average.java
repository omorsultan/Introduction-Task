package practice_problem_03;

import java.util.Scanner;
public class average{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
  
    System.out.println("How many numbers will you enter? ");
    int n = input.nextInt();
    
    double[] numbers = new double[n];
    double sum = 0;
    for(int i=0;i<n;i++)
    {
      System.out.println("Enter "+(i+1)+"th number");
      numbers[i] = input.nextDouble();
      sum +=numbers[i];
    }
    System.out.println("Average is " + sum / n +);
  }
}