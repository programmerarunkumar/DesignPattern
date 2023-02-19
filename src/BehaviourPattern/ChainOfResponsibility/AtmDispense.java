package BehaviourPattern.ChainOfResponsibility;

public interface AtmDispense {

    public void setNextDispenser(AtmDispense atmDispense);

    public void dispense(Currency currency);

}
