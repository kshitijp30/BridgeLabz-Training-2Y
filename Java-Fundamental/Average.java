import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = input.nextFloat();

        System.out.print("Enter the second number: ");
        float  num2 = input.nextFloat();

        System.out.print("Enter the third number: ");
        float  num3 = input.nextFloat();

        float  average = (num1 + num2 + num3) / 3;

        System.out.println("The average is: " + average);
    }
}