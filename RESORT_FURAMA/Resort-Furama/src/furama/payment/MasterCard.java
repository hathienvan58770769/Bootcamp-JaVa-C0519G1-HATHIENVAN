package furama.payment;

public class MasterCard implements Payment{

    @Override
    public String acceptCreditCard() {
        return  "Accept payment by Master Card";
    }
}
