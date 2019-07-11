package furama.library;

public class Music extends Library {

    private String nameSinger;

    public Music() {

    }

    public Music(String name, String nameAuthor,int yearRelease, int length, String nameSinger) {
        super(name, nameAuthor, yearRelease, length);
        this.nameSinger = nameSinger;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    @Override
    public String toString() {
        return "This song " + getName() +
                " is performed by " + getNameSinger() +
                "and by composer " + getNameAuthor() +
                " is released year " + getYearRelease() +
                " in " + getLength() + " minutes";
    }
}
