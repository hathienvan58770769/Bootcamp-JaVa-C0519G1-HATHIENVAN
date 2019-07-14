package furama.swimming;

import furama.customer.Customer;

public class SwimmingTest {
    public static void main(String[] args) {
        Swimming swimming = new Swimming();
        System.out.println(swimming);

        System.out.println("\n");

        Customer customer = new Customer("Nguyen Thi L", 30, 4);
        System.out.println(customer);
        swimming.swimmingPool(8);
    }
}
