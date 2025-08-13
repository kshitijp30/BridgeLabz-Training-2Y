import java.util.Scanner;

class Kilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        double kilometers = input.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.println("The distance in miles is: " + miles);
    }
}