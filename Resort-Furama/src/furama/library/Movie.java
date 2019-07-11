package furama.library;

public class Movie extends Library {
    private String nameMovieDirector;
    public Movie(){

    }
    public Movie(String name, String nameAuthor, String nameMovieDirector,int yearRelease, int length){
        super(name, nameAuthor, yearRelease, length);
        this.nameMovieDirector = nameMovieDirector;
    }

    public String getNameMovieDirector() {
        return nameMovieDirector;
    }

    public void setNameMovieDirector(String nameMovieDirector) {
        this.nameMovieDirector = nameMovieDirector;
    }

    @Override
    public String toString() {
        return "This movie " + getName() + " is written by " +
                getNameAuthor() +", Director Movie "+ getNameMovieDirector() +
                " is released year " + getYearRelease() +" and about " + getLength() +
                " minutes ";
    }


}
