package BehaviourPattern.ChainOfResponsibility;

//https://www.digitalocean.com/community/tutorials/chain-of-responsibility-design-pattern-in-java

public class Main {

    private static AtmDispense getAtmDispenser(){
        ThousandDispenser thousandDispenser = new ThousandDispenser();
        FiveHundredDispenser fiveHundredDispenser = new FiveHundredDispenser();
        HundredDispenser hundredDispenser = new HundredDispenser();

        thousandDispenser.setNextDispenser(fiveHundredDispenser);
        fiveHundredDispenser.setNextDispenser(hundredDispenser);

        return thousandDispenser;
    }

    public static void main(String[] args){

        Currency currency = new Currency(1700);
        if(currency.getAmount() > 0){
            AtmDispense atmDispense = getAtmDispenser();
            atmDispense.dispense(currency);
        }

    }
}
