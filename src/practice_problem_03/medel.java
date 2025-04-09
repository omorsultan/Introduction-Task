package practice_problem_03;

import java.util.Scanner;

public class medel {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your maximum grade of the semester :");
        Float grade = obj.nextFloat();
        if(grade>=3.5)
        {
            System.out.println("Are you completed the semester? ");
            boolean sem = obj.nextBoolean();
            if(sem == true )
            {
                System.out.println("Give a medel.");
            }
            else
            {
                System.out.println("Not selected for a medel.");
            }
        }
        else
        {
            System.out.println("Not selected for a medel.");
        }
    }
}
