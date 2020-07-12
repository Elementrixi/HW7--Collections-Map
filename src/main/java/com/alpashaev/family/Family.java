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

    @Override
    public boolean equals(Object f) {
        if (this == f) return true;
        if (getClass() != f.getClass()) return false;
        Family family = (Family) f;
        return name.equals(family.name) &&
                quantityMember == family.quantityMember &&
                title.equals(family.title) &&
                emblemName.equals(family.emblemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantityMember, title, emblemName);
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
