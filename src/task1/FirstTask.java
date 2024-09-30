package task1;

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] arg) {
        System.out.println("Enter your first name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Enter your last name");
        String lastName = scanner.next();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your employee number");
        int number = scanner.nextInt();

        String email = name.toLowerCase() + "." + lastName.toLowerCase() + "@gmail.com";

        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Employee number: " + number);
        System.out.println("Email: " + email);
    }
}
