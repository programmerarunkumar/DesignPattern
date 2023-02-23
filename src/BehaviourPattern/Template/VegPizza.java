package BehaviourPattern.Template;

public class VegPizza extends Pizza{
    void prepareIngredients() {
        System.out.println("Prepairing the veg ingredients");
    }

    void addToppings() {
        System.out.println("Adding Veg Toppings");
    }

}
