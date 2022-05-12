package ru.skypro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numsAL = new ArrayList<>(List.of(51, 20, 4, 5, 30, 20, 42, 4, 42, 3, 3, 33));

        System.out.println("Task 1");
        System.out.println(numsAL);
        for (Integer num : numsAL) {
            if ((num % 2) != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("Task 2");
        Collections.sort(numsAL);
        System.out.println(numsAL);
        Set<Integer> numSet = new HashSet<>();
        for (Integer num : numsAL) {
            if (numSet.add(num)) {
                if ((num % 2) == 0) {
                    System.out.print(num + " ");
                }
            }
        }
        System.out.println();
        // Task 3
        System.out.println("Task 3");

        String text = "banana apple banana HELLO bye ok hello home sun sun ok Sun HOME HELLO bye SuN";
        String[] words = text.toUpperCase().split(" ");
        Set<String> numSet1 = new HashSet<>(Arrays.asList(words));
        System.out.println(numSet1);
        // Task 4
        System.out.println("Task 4");

        Map<String, Integer> mapWord = new HashMap<>();
        for (int i = 0; i <= words.length - 1; i++) {
            mapWord.merge(words[i], 1, (a, b) -> a + b);
        }
//        System.out.println(mapWord);
        for (Map.Entry<String, Integer> kvWord : mapWord.entrySet()) {
            if (kvWord.getValue() > 1) {
                System.out.println(kvWord.getKey() + " повторяется " + kvWord.getValue() + " раз(а)");
            }
        }
//        System.out.println(Arrays.toString(words));

    }
}