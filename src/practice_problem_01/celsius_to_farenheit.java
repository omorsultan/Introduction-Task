package practice_problem_01;

import java.util.Scanner;

public class celsius_to_farenheit {
    public static void main(String[] args) {
        System.out.println("Enter temperature in Celsius : ");
        Scanner myObj =new Scanner(System.in);
        float tempInCel=myObj.nextFloat();
        float tempInFar=(tempInCel*9)/5+32;
        System.out.println("Temperature in Farenheit scale is : "+tempInFar);
    }
}
