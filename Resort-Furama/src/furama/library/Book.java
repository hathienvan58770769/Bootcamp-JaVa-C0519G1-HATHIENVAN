package furama.library;

public class Book extends Library {

    public Book(){

    }
    public Book(String name, String nameAuthor, int yearRelease, int length){
        super(name, nameAuthor, yearRelease, length);
    }

    @Override
    public String toString() {
        return "This book " + getName() +
                " is written by " + getNameAuthor() +
                " is released year " + getYearRelease() +
                " and about " + getLength() + " pages";
    }
}
