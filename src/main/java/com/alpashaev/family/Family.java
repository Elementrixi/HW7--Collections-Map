package main.java.com.alpashaev.family;

public class Family implements Comparable<Family> {
    private String name;
    private int quantityMember;
    private String title;
    private String emblemName;

    public Family(String name, int quantityMember, String title, String emblemName) {
        this.name = name;
        this.quantityMember = quantityMember;
        this.title = title;
        this.emblemName = emblemName;
    }

    public int compareTo(Family f) {
        return name.compareTo(f.getName());
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getEmblemName() {
        return emblemName;
    }

    @Override
    public String toString() {
        return "Family : " +
                " name = '" + name + '\'' +
                ", quantity members = " + quantityMember +
                ", title = '" + title + '\'' +
                ", emblemName = '" + emblemName + '\'';
    }
}
