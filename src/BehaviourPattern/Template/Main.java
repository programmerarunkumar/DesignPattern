package BehaviourPattern.Template;

//https://www.techcrashcourse.com/2020/09/template-design-pattern-in-java.html
//https://springframework.guru/gang-of-four-design-patterns/template-method-pattern/

public class Main {

    public static void main(String[] args){

        VegPizza vegPizza = new VegPizza();
        vegPizza.preparePizza();

        NonVegPizza nonVegPizza = new NonVegPizza();
        nonVegPizza.preparePizza();

    }
}
