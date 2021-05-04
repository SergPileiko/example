package by.course.task.frequency;

import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        int frequency;
        String sentence;
        String word;
        sentence = enterFromConsole("Введите текст >>");
        word = enterFromConsole("Введите слово >>");
        frequency = repetitionRate(sentence, word);
        System.out.println("Слово \"" + word + "\" встречается в тексте " + frequency + " раз(а).");
    }

    private static String enterFromConsole(String message) {
        String str;
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        return str;
    }

    private static int repetitionRate(String text, String word) {
        if (text == null || text.isEmpty() || word == null || word.isEmpty()) {
            return 0;
        }
        int count = 0;
        int startPosition = 0;
        while (startPosition != -1) {
            startPosition = text.toLowerCase().indexOf(word.toLowerCase(), startPosition);
            if (startPosition != -1) {
                startPosition++;
                count++;
            }
        }
        return count;
    }
}
