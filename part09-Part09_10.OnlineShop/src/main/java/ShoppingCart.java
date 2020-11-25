
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class ShoppingCart {
    
    private Map<String, Item> cart;
    
    public ShoppingCart(){
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price){
       
        if(!(cart.containsKey(product))){
            Item newItem = new Item(product, 1, price);
            cart.put(product, newItem);
        } else {
            Item i = cart.get(product);
            i.increaseQuantity();
        }
         
    }
    
    public int price(){
        int totalPrice = 0;
        for (Item price : cart.values()){
            int j = price.price();
            totalPrice += j;
        }
        return totalPrice;
    }
    
    public void print(){
        int i = 0;
        for (String key : cart.keySet()){
            System.out.println(cart.get(key));
        }
        
     
    }
    
}
