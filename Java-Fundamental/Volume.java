import java.util.Scanner;

class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float PI = 3.14159f;

        System.out.print("Enter the radius of the cylinder: ");
        float radius = input.nextFloat();

        System.out.print("Enter the height of the cylinder: ");
        float height = input.nextFloat();

        float volume = PI * radius * radius * height;

        System.out.println("The volume of the cylinder is: " + volume);
    }
}