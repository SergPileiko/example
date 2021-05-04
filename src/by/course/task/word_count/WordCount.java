package by.course.task.word_count;

import java.util.Arrays;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        int countWords;
        String[] stringArr;
        stringArr = createArray(enterFromConsole("Введите предложение >>"));
        countWords = stringArr.length;
        System.out.println("Колличество слов в предложении: " + countWords);
        sortAndChangeArray(stringArr);
        printArray(stringArr);
    }

    private static String enterFromConsole(String message) {
        String str;
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        return str;
    }

    private static String[] createArray(String str) {
        String[] array = (str.replaceAll("\\p{Punct}", "")).split(" +");
        return array;
    }

    private static void printArray(String[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void sortAndChangeArray(String[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = makeFirstUpperCase(array[i]);
        }
        Arrays.sort(array);
    }

    private static String makeFirstUpperCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
