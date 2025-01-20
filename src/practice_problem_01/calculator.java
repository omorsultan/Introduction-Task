package practice_problem_01;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a First input: ");
        int a= obj.nextInt();
        System.out.println("Enter a Second input: ");
        int b= obj.nextInt();
        System.out.println("Enter the operator: ");
        char c=obj.next().charAt(0);
        int result;
        if(c=='+') System.out.println("The result is : " +(a+b));
        else if(c=='-') System.out.println("The result is : "+(a-b));
        else if(c=='*') System.out.println("The result is : "+(a*b));
        else if(c=='/') System.out.println("The result is : "+(a/b));
        else System.out.println("The operator is undefined.");
    }
}
