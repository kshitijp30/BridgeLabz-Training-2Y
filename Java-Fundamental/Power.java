import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = input.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = input.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println("The result is: " + result);
    }
}