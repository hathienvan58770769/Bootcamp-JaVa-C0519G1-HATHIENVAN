package furama.accommodation.villa;

import furama.accommodation.Accommodation;

import java.util.Arrays;

public class Villa extends Accommodation {
    private final int bedVilla = 1;
    private final int moneyToRentVillaDayCost = 10;
    private  String[] listVillas = {"villa1", "villa2", "villa3", "villa4", "villa5"};

    public Villa() {

    }
    public Villa( String name, int size, int price) {
        super(name, size, price);
    }
    public void showAllVillas() {
        for (int i = 0; i < listVillas.length; i++) {
            System.out.print(listVillas[i] + "\t");
        }
    }
    public void choiceVillas(String villas){
        for (int i = 0; i < listVillas.length ; i++) {
            if (listVillas[i] == villas ){
                System.out.print(listVillas[i] + "\t");
            }
        }
    }
    public void numOfDay(int amountMoney) {
        switch (amountMoney) {
            case 100:
            case 50:
            case 30:
                System.out.println(amountMoney + "USD, Can stay for "+ (amountMoney / moneyToRentVillaDayCost)  + " days in the villa" );
                break;
            default:
                break;
        }
    }

    public void payMoneyVillas(int amountMoney, int days) {
        int payMoney = days * moneyToRentVillaDayCost;
        if (amountMoney > payMoney)
            System.out.print("in " + days + " days. The amount to be paid is : " + payMoney + " USD, Your balance money is : " + (amountMoney - payMoney) + " USD.");
        else if (amountMoney < payMoney)
            System.out.print("in " + days +" days. The amount to be paid is : " + payMoney + " USD, Please give more money is : " + (payMoney - amountMoney) + " USD.");
        else
            System.out.print("in " + days + " days. The amount to be paid is : " + payMoney + " USD.");

    }

}
