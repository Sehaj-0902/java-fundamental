import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of rectangle: ");
	int length = sc.nextInt();
	System.out.println("Enter the width of rectangle: ");
	int width = sc.nextInt();
	int perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is "+perimeter);
    }
}
