package BehaviourPattern.ChainOfResponsibility;

public class FiveHundredDispenser implements AtmDispense{

    AtmDispense atmDispense;

    public void setNextDispenser(AtmDispense atmDispense) {
        this.atmDispense = atmDispense;
    }

    public void dispense(Currency currency) {
        if(currency.getAmount() >= 500){
            int numberOfFiveHundreds = currency.getAmount() / 500;
            int remainingAmount = currency.getAmount() % 500;
            System.out.println(numberOfFiveHundreds + " FiveHundreds");
            if(remainingAmount > 0){
                atmDispense.dispense(new Currency(remainingAmount));
            }
        }else {
            atmDispense.dispense(currency);
        }
    }

}
