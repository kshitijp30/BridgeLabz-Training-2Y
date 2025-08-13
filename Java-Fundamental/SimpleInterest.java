import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        float principal = input.nextFloat();

        System.out.print("Enter the annual rate of interest: ");
        float rate = input.nextFloat();

        System.out.print("Enter the time period in years: ");
        float time = input.nextFloat();

        float simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is: " + simpleInterest);
    }
}