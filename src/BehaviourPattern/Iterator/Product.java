package BehaviourPattern.Iterator;

public class Product {

    String productName;

    int quantity;

    Product(String productName, int quantity){
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName(){
        return this.productName;
    }

    public int getProductQuantity(){
        return this.quantity;
    }

}
