package practice_problem_03;
import java.util.*;
public class bonus
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter sales percentege: ");
        int sales = obj.nextInt();
        System.out.println("Enter attendences percentage: ");
        int attendence = obj.nextInt();
        if(sales>=95 && attendence == 100 )
        {
            System.out.println("60% bonus.");
        }
        else if (sales>= 95 && attendence >= 90)
        {
            System.out.println("40% bonus.");
        }
        else if(sales>=80 && attendence == 100)
        {
            System.out.println("40% bonus.");
        }
        else if(sales>=80 && attendence>=90)
        {
            System.out.println("20% bonus.");
        }
        else
        {
            System.out.println("5% bonus.");
        }
    }
}
