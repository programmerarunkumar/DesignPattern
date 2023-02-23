package BehaviourPattern.Template;

public abstract class Pizza {

    void preparePizza(){
        prepareIngredients();
        bakePizza();
        addToppings();
    }

    abstract void prepareIngredients();
    private void bakePizza(){
        System.out.println("Baking the Pizza");
    }

    abstract void addToppings();

}
