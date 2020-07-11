package main.java.com.alpashaev.family.coparators;

import main.java.com.alpashaev.family.Family;

import java.util.Comparator;

public class TitleCompare implements Comparator<Family> {
    @Override
    public int compare(Family f1, Family f2) {
        return f2.getTitle().compareTo(f1.getTitle());
    }
}
