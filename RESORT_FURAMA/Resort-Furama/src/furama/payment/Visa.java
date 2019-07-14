package furama.payment;

public class Visa implements Payment {

    @Override
    public String acceptCreditCard() {
        return  "Accept payment by V";
    }
}
