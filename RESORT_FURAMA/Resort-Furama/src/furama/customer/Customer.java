package furama.customer;

import java.util.Arrays;
public class Customer<C> {
    private String customerName;
    private int customerAge;
    private int numOfDay;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 11;
    private C[] customers = (C[]) new Object[DEFAULT_CAPACITY];

    public Customer() {

    }
    public Customer(C[] customer){
        for (int i = 0; i < customer.length; i++) {
            add(customer[i]);
        }
    }

    public Customer(String customerName, int customerAge, int numOfDay) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.numOfDay = numOfDay;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int age) {
        this.customerAge = age;
    }

    public int getNumOfDay() {
        return numOfDay;
    }

    public void setNumOfDay(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    private  void ensureCapacity(){
        int newSize = customers.length * 2;
        customers = Arrays.copyOf(customers, newSize);
    }
    public void add(C customer){
        if (size == customers.length){
            ensureCapacity();
        }
        customers[size++] = customer;
    }
    public  C get(int index){
        if (index > size || index <= 0 ){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size " + index);
        }
        return (C) customers[index-1];

    }
    @Override
    public String toString() {
        return "Name : " + getCustomerName() + ", Age : " +
                getCustomerAge() + ", num of days : " +
                getNumOfDay() + " days." + "\n";

    }
}
