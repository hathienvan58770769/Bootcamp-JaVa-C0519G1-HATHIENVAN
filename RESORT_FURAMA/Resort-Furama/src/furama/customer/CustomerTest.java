package furama.customer;

import furama.accommodation.house.House;
import furama.accommodation.villa.Villa;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer = new Customer("Nguyen Van A", 20, 4);
        System.out.println(customer);

        Villa villas = new Villa();
        System.out.print("Customer to rent is ");
        villas.choiceVillas("villa1");
        villas.payMoneyVillas(100, 4);

        System.out.println("\n");
        customer = new Customer("Le Thi Thu", 35, 2);
        System.out.println(customer);
        House house = new House();
        System.out.print("Customer to rent is ");
        house.choiceHouse("house2");
        house.payMoneyHouse(10, 2);

    }
}
