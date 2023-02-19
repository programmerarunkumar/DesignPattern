package BehaviourPattern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List cart;

    Cart(){
        cart = new ArrayList<>();
    }

    public void addProduct(Product product){
        cart.add(product);
    }

    private class CartIterator implements Iterator{

        int position;
        @Override
        public boolean hasnext() {
            if(position >= cart.size()){
                return false;
            }else {
                return true;
            }
        }

        @Override
        public Object next() {
            return cart.get(position++);
        }

    }

    public Iterator iterator(){
        return new CartIterator();
    }

}
