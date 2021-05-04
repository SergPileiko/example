package by.course.task.calculation_method;

import java.util.Scanner;

public class CalculationMethod {
    public static void main(String[] args) {
        int value1;
        int value2;
        int leastCommonMultiple;
        int greatestCommonFactor;

        value1 = enterFromConsole("Введите первое целое число >>");
        value2 = enterFromConsole("Введите второе целое число >>");
        greatestCommonFactor = greatestCommonFactorEuclid(value1, value2);
        leastCommonMultiple = leastCommonMultiple(value1, value2);

        if (greatestCommonFactor == -1) {
            System.out.println("НОД(" + value1 + ", " + value2 + ") не определяется!");
        } else {
            System.out.println("НОД(" + value1 + ", " + value2 + ") = " + greatestCommonFactor);
        }

        if (leastCommonMultiple == -1) {
            System.out.println("НОК(" + value1 + ", " + value2 + ") не определяется!");
        } else {
            System.out.println("НОК(" + value1 + ", " + value2 + ") = " + leastCommonMultiple);
        }
    }

    private static int enterFromConsole(String message) {
        int value = 0;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.print("Ошибка! " + message);
            sc.nextLine();
        }
        value = sc.nextInt();
        return value;
    }

    private static int greatestCommonFactorEuclid(int a, int b) {  //наибольший общий делитель
        if (a == 0 && b == 0) {
            return -1;
        }
        if (a == 0) {
            return Math.abs(b);
        } else if (b == 0) {
            return Math.abs(a);
        }
        int gcf = 0;
        int min = Math.abs(a);
        int max = Math.abs(b);

        if (min > max) {
            min = Math.abs(b);
            max = Math.abs(a);
        }
        boolean next = false;
        int remainder;
        while (!next) {
            remainder = max % min;
            if (remainder == 0) {
                gcf = min;
                next = true;
            } else {
                max = min;
                min = remainder;
            }
        }
        return gcf;
    }

    private static int leastCommonMultiple(int a, int b) {
        int leastCommonMultiple = 1;
        if (a == 0 || b == 0) {
            return -1;
        }
        leastCommonMultiple = (a * b) / greatestCommonFactorEuclid(a, b);
        return Math.abs(leastCommonMultiple);
    }
}
