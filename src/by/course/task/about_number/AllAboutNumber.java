package by.course.task.about_number;

import java.util.Scanner;

public class AllAboutNumber {
    public static void main(String[] args) {
        int value;
        boolean isEven;
        boolean isPrime;
        String str1;
        String str2;

        value = enterFromConsole("Enter an integer >> ");
        isEven = isEven(value);
        isPrime = isPrime(value);
        str1 = ((isEven) ? "even" : "odd");

        if (value == 0) {
            str2 = "not natural";
        } else {
            str2 = ((isPrime) ? "prime" : "composite");
        }

        System.out.println(value + " is an " + str1 + " and " + str2 + " number");
    }

    private static int enterFromConsole(String message) {
        int value = 0;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.print("Error! " + message);
            sc.nextLine();
        }
        value = sc.nextInt();
        return value;
    }

    private static boolean isEven(int value) {
        boolean bool = false;
        if (value % 2 == 0) {
            bool = true;
        }
        return bool;
    }

    private static boolean isPrime(int value) {
        boolean bool = false;
        if (value == 1) {
            return true;
        }
        int count = 0;
        int i = 1;
        while (count < 2 && i < Math.abs(value)) {
            if (value % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 1) {
            bool = true;
        }
        return bool;
    }
}



