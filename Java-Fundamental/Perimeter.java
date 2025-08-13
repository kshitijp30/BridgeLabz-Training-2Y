import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        float length = input.nextFloat();

        System.out.print("Enter the width of the rectangle: ");
        float width = input.nextFloat();

        float perimeter = 2 * (length + width);

        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}