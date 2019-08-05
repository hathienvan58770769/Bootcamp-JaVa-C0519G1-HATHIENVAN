package furama.library;

import java.util.ArrayList;

public class Library<E> {
    private String name;
    private int yearRelease;
    private String nameAuthor;
    private int length;

    ArrayList<E> list = new ArrayList<E>();

    public Library() {

    }

    public Library(String name, String nameAuthor, int yearRelease, int length) {
        this.name = name;
        this.nameAuthor = nameAuthor;
        this.yearRelease = yearRelease;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public void addElement(E elements) {
        list.add(elements);
    }

    public void removeElement(E elements) {
        list.remove(elements);
    }

}
