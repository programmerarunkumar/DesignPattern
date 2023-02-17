package BehaviourPattern.Strategy;

public class Add implements Strategy{

    public int doOperation(int value1, int value2) {
        return value1 + value2;
    }

}
