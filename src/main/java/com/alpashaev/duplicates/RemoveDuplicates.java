package main.java.com.alpashaev.duplicates;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void deleteDuplicates() {
        String string = "1, 2, 3, 4, 4, 5";

        String s = Arrays.stream(string.split(" ")).distinct()
                .collect(Collectors.joining());
        System.out.println(s);
    }
}