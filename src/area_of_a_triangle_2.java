import java.util.Scanner;

public class area_of_a_triangle_2 {
    public static void main(String[] args) {
        Scanner myObj =new Scanner(System.in);
        System.out.println("Enter first arms length : ");
        float a= myObj.nextFloat();
        System.out.println("Enter second arms length : ");
        float b=myObj.nextFloat();
        System.out.println("Enter third arms length : ");
        float c=myObj.nextFloat();
        float s=(a+b+c)/2;
        double area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle is : "+ area);
    }
}
