package furama.accommodation;

public abstract class Accommodation {
    private int size;
    private String name;
    private int price;

    public Accommodation() {
    }

    public Accommodation(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
