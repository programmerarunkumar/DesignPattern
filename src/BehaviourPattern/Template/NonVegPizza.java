package BehaviourPattern.Template;

public class NonVegPizza extends Pizza{
    void prepareIngredients() {
        System.out.println("Prepairing the Non-Veg Ingredients");
    }

    void addToppings() {
        System.out.println("Adding Non-Veg Toppings");
    }
}
