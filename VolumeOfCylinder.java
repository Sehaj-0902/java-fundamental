import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.println("Enter height of the cylinder: ");
        double height = sc.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("The volume of the cylinder is: " + volume);
    }
}
