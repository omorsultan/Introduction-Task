import java.util.Scanner;

public class area_of_a_circle {
    public static void main(String[] args) {
        System.out.println("Enter radius of the circle : ");
        Scanner myObj = new Scanner(System.in);
        float radius = myObj.nextFloat();
        final float pi =3.14159F;
        float area = pi *radius*radius;
        System.out.println("Area of the circle is : "+area);
    }
}
