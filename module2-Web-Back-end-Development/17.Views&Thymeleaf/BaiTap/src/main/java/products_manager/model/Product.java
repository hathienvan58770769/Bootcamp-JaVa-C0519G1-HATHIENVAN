package products_manager.model;

public class Product {
    private int id;
    private String name;
    private float price;
    private int numbersAmount;

    public Product(){

    }
    public Product(int id, String name, float price, int numbersAmount){
        this.id = id;
        this.name = name;
        this.price = price;
        this.numbersAmount = numbersAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumbersAmount() {
        return numbersAmount;
    }

    public void setNumbersAmount(int numbersAmount) {
        this.numbersAmount = numbersAmount;
    }
}
