package BehaviourPattern.Strategy;

public class Context {

    private Strategy strategy;

    Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int value1, int value2){
        return strategy.doOperation(value1, value2);
    }

}
