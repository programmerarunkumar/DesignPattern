package BehaviourPattern.Iterator;

//https://www.scaler.com/topics/design-patterns/iterator-design-pattern/

public class Main {

    public static void main(String[] args){

        Product product1 = new Product("Watch", 1);
        Product product2 = new Product("EarBuds", 2);

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        Iterator iterator = cart.iterator();
        while (iterator.hasnext()){
            Product product = (Product) iterator.next();
            System.out.println(product.getProductName() + " - " + product.getProductQuantity());
        }

    }

}
