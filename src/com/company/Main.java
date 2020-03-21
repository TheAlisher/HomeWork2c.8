package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String[]> bigDictionary = new HashMap<>();

        bigDictionary.put("робот", new String[]{"андроид", "киборг", "машина", "устройство"});
        bigDictionary.put("демон", new String[]{"бес", "нечистый", "дух", "дьявол"});
        bigDictionary.put("ниндзя", new String[]{"скрытный", "шпион", "убийца", "разведчик"});
        bigDictionary.put("добрый", new String[]{"добродушный", "благодушный", "добродетельный", "благой"});
        bigDictionary.put("харизматичный", new String[]{"прекрасный", "притягательный", "отличный", "симпатичный"});
        bigDictionary.put("красивый", new String[]{"блестящий", "дивный", "чудный", "обворожительный"});

        HashMap<String, String[]> bigDictionaryHash = new HashMap<>(bigDictionary);

        Set<String> stringSet = bigDictionary.keySet();
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            try {
                String key = iterator.next();
                String[] array1 = bigDictionaryHash.get(key);
                bigDictionaryHash.put(key, array1);

                for (String string : array1) {
                    ArrayList<String> arrayList = new ArrayList<>(array1.length);
                    arrayList.addAll(Arrays.asList(array1));
                    arrayList.add(key);
                    arrayList.remove(string);
                    String[] array2 = new String[arrayList.size()];
                    //array2 = new arrayList.toArray(array2);
                    bigDictionaryHash.put(string, array2);
                    System.out.println("Большой словарь" + " - " + string + " - " + Arrays.toString(array1));
                }
            } catch (Exception e) {

            }
        }

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