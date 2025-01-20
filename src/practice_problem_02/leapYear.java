package practice_problem_02;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int Year= obj.nextInt();
        if((Year%400==0)||(Year%4==0 && Year % 100 !=0)) System.out.println("Leap year.");
        else System.out.println("Not Leap Year");
        
    }
}
