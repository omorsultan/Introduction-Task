import java.util.Scanner;
import java.lang.Math;

public class area_of_a_equilateral_triangle {
    public static void main(String[] args) {
        System.out.println("Enter arm of a equilateral triangle : ");
        Scanner myObj =new Scanner(System.in);
        float arm = myObj.nextFloat();
       double area = (Math.sqrt(3)/4)*arm*arm;
        System.out.println("Area of the equilateral triangle is : "+area);
    }
}
