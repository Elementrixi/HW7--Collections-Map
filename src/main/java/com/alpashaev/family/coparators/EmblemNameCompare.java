package main.java.com.alpashaev.family.coparators;

import main.java.com.alpashaev.family.Family;

import java.util.Comparator;

public class EmblemNameCompare implements Comparator<Family> {
    @Override
    public int compare(Family f1, Family f2) {
        return f1.getEmblemName().length() - f2.getEmblemName().length();
    }
}
