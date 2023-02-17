package BehaviourPattern.ChainOfResponsibility;

public class ThousandDispenser implements AtmDispense{

    AtmDispense atmDispense;
    public void setNextDispenser(AtmDispense atmDispense) {
        this.atmDispense = atmDispense;
    }

    public void dispense(Currency currency) {
        if(currency.getAmount() >= 1000){
            int numberOfThousands = currency.getAmount() / 1000;
            int remainingAmount = currency.getAmount() % 1000;
            System.out.println(numberOfThousands + " Thousands");
            if(remainingAmount > 0){
                atmDispense.dispense(new Currency(remainingAmount));
            }
        }else {
            atmDispense.dispense(currency);
        }
    }
}
