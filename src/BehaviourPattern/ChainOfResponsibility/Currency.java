package BehaviourPattern.ChainOfResponsibility;

public class Currency {

    private int amount;

    Currency(int amount){
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

}
