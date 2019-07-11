package furama.cinema;

import java.util.LinkedList;

public class Cinema4D<E> {
    private String id;
    private String movieTickets;
    private String rowOfSeats;
    LinkedList<E> list = new LinkedList<E>();
    public Cinema4D(){}
    public Cinema4D(String id, String movieTickets, String rowOfSeats){
        this.id = id;
        this.movieTickets = movieTickets;
        this.rowOfSeats = rowOfSeats;
    }



}
