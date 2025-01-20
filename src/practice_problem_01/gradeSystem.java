package practice_problem_01;

import java.util.Scanner;

public class gradeSystem {
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter marks of the subject : ");
    Float num= obj.nextFloat();
    if(num>=90) System.out.println("A+.");
    else if(num>=80) System.out.println("A");
    else if(num>=70) System.out.println("A-");
    else if (num>=60) System.out.println("B");
    else if (num>=40) System.out.println("C+");
    else System.out.println("F");
}
}
