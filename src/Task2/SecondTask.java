package Task2;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println("Enter the total leased money: ");
        Scanner scanner = new Scanner(System.in);
        double totalLeasedMoney = scanner.nextDouble();

        System.out.println("Enter the down payment: ");
        double downPayment = scanner.nextDouble();

        System.out.print("Enter the lease term in the months: ");
        int leaseTerm = scanner.nextInt();

        System.out.println("Enter the interest rate: ");
        double interestRate = scanner.nextDouble();

        double principal = totalLeasedMoney - downPayment;
        double monthlyPayment = (principal + (principal * (interestRate / 100))) / leaseTerm;

        System.out.printf("The monthly payment is: %.2f\n", monthlyPayment);
    }
}
