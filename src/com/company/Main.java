package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String[]> bigDictionary = new HashMap<>();

        bigDictionary.put("робот", new String[]{"андроид", "киборг", "машина", "устройство"});
        bigDictionary.put("демон", new String[]{"бес", "нечистый", "дух", "дьявол"});
        bigDictionary.put("нинздя", new String[]{"скрытный", "шпион", "убийца", "разведчик"});
        bigDictionary.put("добрый", new String[]{"добродушный", "благодушный", "добродетельный", "благой"});
        bigDictionary.put("харизматичный", new String[]{"прекрасный", "притягательный", "отличный", "симпатичный"});
        bigDictionary.put("красивый", new String[]{"блестящий", "дивный", "чудный", "обворожительный"});

        while (true) {
            System.out.println("Введите слово: ");
            Scanner scanner = new Scanner(System.in);
            String sentences = scanner.nextLine();
            String[] words = sentences.split(" ");
            for (String word : words) {
                String[] synonyms = bigDictionary.get(word);
                Collection<String[]> bigDictionaryList = bigDictionary.values();
                bigDictionaryList.remove(words);
                bigDictionary.get(word);
                bigDictionary.containsValue(words);
                Random r = new Random();
                if (synonyms != null) {
                    System.out.print(synonyms[r.nextInt(synonyms.length)] + " ");
                } else {
                    System.out.print(" ТАКОГО СЛОВО НЕТ В СЛОВАРЕ");
                }
            }
            System.out.println();
        }
    }
}