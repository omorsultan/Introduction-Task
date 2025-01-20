package practice_problem_01;

import java.util.Scanner;

public class area_of_a_triangle {
    public static void main(String[] args) {
        Scanner myObj =new Scanner(System.in);
        System.out.println("Enter base : ");
        float base =myObj.nextFloat();
        System.out.println("Enter Height : ");
        float height =myObj.nextFloat();
        float area = 0.5F *base*height;
        System.out.println("Area of the triangle is : "+area);
    }
}
