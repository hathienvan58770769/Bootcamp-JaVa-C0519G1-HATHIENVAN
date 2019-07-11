package furama.accommodation.house;

import furama.accommodation.Accommodation;

import java.util.Arrays;

public class House extends Accommodation {
    private final int BED = 4;
    private int moneyToRentHouseDayCost = 5;
    private String[] listHouses = {"house1", "house2"};

    public House() {
    }

    public House(String name, int size, int price) {
        super(name, size, price);
    }

    public String[] getListHouses() {
        return listHouses;
    }

    public void showAllHouses() {
        for (int i = 0; i < listHouses.length; i++) {
            System.out.println(listHouses[i] + "\t");
        }
    }
    public void choiceHouse(String villas){
        for (int i = 0; i < listHouses.length ; i++) {
            if (listHouses[i] == villas ){
                System.out.print(listHouses[i] + "\t");
            }
        }
    }
    public void payMoneyHouse(int amountMoney, int days) {
        int pay = days * moneyToRentHouseDayCost;
        if (amountMoney > pay)
            System.out.print("in " + days + " days. The amount to be paid is : " + pay + " USD, Your balance money is : " + (amountMoney - pay) + " USD.");
        else if (amountMoney < pay)
            System.out.print("in " + days +" days. The amount to be paid is : " + pay + " USD, Please give more money is : " + (pay - amountMoney) + " USD.");
        else
            System.out.print("in " + days + " days. The amount to be paid is : " + pay + " USD.");

    }
}
