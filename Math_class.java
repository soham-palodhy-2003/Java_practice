import java.util.Scanner;

public class Math_class {
    public static void main(String[] args) {
        double x,y,z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Side X:");
        x = sc.nextDouble();
        System.out.println("Enter Side Y:");
        y = sc.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("The Hypotenuse is: " +z);

        sc.close();
    }
}
