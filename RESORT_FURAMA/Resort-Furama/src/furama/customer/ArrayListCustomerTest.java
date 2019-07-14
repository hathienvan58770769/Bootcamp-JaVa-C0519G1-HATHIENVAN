package furama.customer;

public class ArrayListCustomerTest {
    public static void main(String[] args) {
        Customer<Customer> listCustomers = new Customer<Customer>();
        listCustomers.add(new Customer("Nguyen Van A", 20, 5));
        listCustomers.add(new Customer("Le Thi B", 22, 5));
        listCustomers.add(new Customer("Ha Thi V", 23, 8));
        listCustomers.add(new Customer("Tran Van S", 24, 9));
        listCustomers.add(new Customer("Le Van B", 21, 2));
        listCustomers.add(new Customer("Tran Van P", 10, 3));
        listCustomers.add(new Customer("Tran Thi C", 18, 1));
        listCustomers.add(new Customer("Nguyen Thi Q", 40, 29));
        listCustomers.add(new Customer("Ha Van V", 4, 12));
        listCustomers.add(new Customer("Tran Thi L", 30, 11));

        System.out.println("Customer 1  : " + listCustomers.get(1));
        System.out.println("Customer 2  : " + listCustomers.get(2));
        System.out.println("Customer 3  : " + listCustomers.get(3));
        System.out.println("Customer 4  : " + listCustomers.get(4));
        System.out.println("Customer 5  : " + listCustomers.get(5));
        System.out.println("Customer 6  : " + listCustomers.get(6));
        System.out.println("Customer 7  : " + listCustomers.get(7));
        System.out.println("Customer 8  : " + listCustomers.get(8));
        System.out.println("Customer 9  : " + listCustomers.get(9));
        System.out.println("Customer 10  : " + listCustomers.get(10));


    }
}
