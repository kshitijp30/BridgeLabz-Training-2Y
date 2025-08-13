import java.util.Scanner;

class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float PI = 3.14159f;

        System.out.print("Enter the radius of the circle: ");
        float radius = input.nextFloat();

        float area = PI * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }
}