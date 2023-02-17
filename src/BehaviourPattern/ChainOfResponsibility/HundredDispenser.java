package BehaviourPattern.ChainOfResponsibility;

public class HundredDispenser implements AtmDispense{

    private AtmDispense atmDispense;

    public void setNextDispenser(AtmDispense atmDispense) {
        this.atmDispense = atmDispense;
    }

    public void dispense(Currency currency) {
        if(currency.getAmount() >= 100){
            int numberOfHundreds = currency.getAmount() / 100;
            int remainder = currency.getAmount() % 100;
            System.out.println(numberOfHundreds + " Hundreds");
            if(remainder > 0){
                atmDispense.dispense(new Currency(remainder));
            }
        }else {
            atmDispense.dispense(currency);
        }
    }
}
