import java.util.Scanner;

public class volume_of_a_ball {
    public static void main(String[] args) {
        System.out.println("Enter radius of the ball : ");
        Scanner myObj=new Scanner(System.in);
        float radius =myObj.nextFloat();
        final float pi =3.14159F;
        float volume =(4*pi*radius*radius*radius)/3;
        System.out.println("The volume is : "+volume);
    }
}
