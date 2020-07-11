package main.java.com.alpashaev.executor;


import main.java.com.alpashaev.duplicates.RemoveDuplicates;
import main.java.com.alpashaev.family.Family;
import main.java.com.alpashaev.family.coparators.EmblemNameCompare;
import main.java.com.alpashaev.family.coparators.TitleCompare;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


public class Executor {

    public static void homeworkSolution() {

        RemoveDuplicates.deleteDuplicates();

        TreeMap<Family, Integer> familyMap = new TreeMap<>();
        familyMap.put(new Family("Maslennikov ", 343, "Wizard", "Mask"), 1);
        familyMap.put(new Family("Simpson ", 453, "King", "Sword"), 2);
        familyMap.put(new Family("Finyak ", 456, "Queen", "Crown"), 3);
        familyMap.put(new Family("Light ", 23, "Angel", "Wings"), 4);
        familyMap.put(new Family("Dark ", 3325, "Devil", "Horns"), 5);
        familyMap.put(new Family("Alex ", 679, "Rider", "Motorbike"), 6);
        familyMap.put(new Family("Batmen ", 807, "Superhero", "Watermark"), 7);
        familyMap.put(new Family("Zangezo ", 7801, "Human", "Hands"), 8);
        familyMap.put(new Family("Caril ", 245, "Mermaid", "Tail"), 9);
        familyMap.put(new Family("Pubg ", 895, "Gamer", "Gamepad"), 10);
        System.out.println("\nSort name by alphabet order : ");
        familyMap.forEach((Family, Integer) -> System.out.println(Family));

        Map<Family, Integer> myFamilyReverseMap = new TreeMap<>(Collections.reverseOrder(new TitleCompare()));
        myFamilyReverseMap.putAll(familyMap);

        System.out.println("\nSort title in order : ");
        for (Map.Entry<Family, Integer> entry : myFamilyReverseMap.entrySet()) {
            Family key = entry.getKey();
            System.out.println(key);
        }
        System.out.println("\nSort emblems by length : ");

        Map<Family, Integer> emblemsSortingMap = new TreeMap<>(new EmblemNameCompare());
        emblemsSortingMap.putAll(familyMap);

        for (Map.Entry<Family, Integer> entry : emblemsSortingMap.entrySet()) {
            Family key = entry.getKey();
            System.out.println(key);
        }
    }
}
