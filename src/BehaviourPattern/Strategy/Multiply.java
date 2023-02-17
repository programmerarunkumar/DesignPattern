package BehaviourPattern.Strategy;

public class Multiply implements Strategy{

    public int doOperation(int value1, int value2) {
        return value1 * value2;
    }

}
