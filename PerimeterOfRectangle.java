import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter length of the rectangle: ");
	int length = sc.nextInt();
	System.out.println("Enter width of the rectangle: ");
	int width = sc.nextInt();
	int perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is "+perimeter);
    }
}
