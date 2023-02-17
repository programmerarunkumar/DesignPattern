package BehaviourPattern.Strategy;

//https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm

public class Main {

    public static void main(String[] args){
        Context context = new Context(new Add());
        System.out.println("Add : " + context.executeStrategy(10,2));

        context = new Context(new Subtract());
        System.out.println("Subtract : " + context.executeStrategy(10,2));

        context = new Context(new Divide());
        System.out.println("Divide : " + context.executeStrategy(10,2));

        context = new Context(new Multiply());
        System.out.println("Multiply : " + context.executeStrategy(10,2));
    }

}
