package by.course.task.palindrome;

import java.util.Scanner;

public class FindPalindrome {
    public static void main(String[] args) {
        int numberN;
        numberN = enterFromConsole("Введите длинну последовательности N (не более 100) >>");
        printPalindrome(numberN);
    }

    private static int enterFromConsole(String message) {
        int value = 0;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        boolean correct = false;
        while (!correct) {
            while (!sc.hasNextInt()) {
                System.out.print(message);
                sc.nextLine();
            }
            value = sc.nextInt();
            if (value > 0 && value <= 100) {
                correct = true;
            } else {
                System.out.print(message);
            }
        }
        return value;
    }

    private static void printPalindrome(int n) {
        int[] array = createPalindrome();
        for (int i = 0; i < array.length && array[i] < n; i++) {
            System.out.printf("[%2d] ", array[i]);
        }
    }

    private static int[] createPalindrome() {
        int[] palindromeArray = new int[9];
        int palindrome = 11;
        int palindromeStep = 11;
        for (int i = 0; i < palindromeArray.length; i++) {
            palindromeArray[i] = palindrome;
            palindrome = palindrome + palindromeStep;
        }
        return palindromeArray;
    }
}
