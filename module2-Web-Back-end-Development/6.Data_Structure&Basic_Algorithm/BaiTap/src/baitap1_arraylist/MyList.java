package baitap1_arraylist;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
    }

    public MyList(int capacity) {
        this.size = capacity;
    }
}

