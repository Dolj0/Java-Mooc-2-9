/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class OneItemBox extends Box{
    private Item item;
    
    public OneItemBox(){
        item = new Item("",0);
    }

    @Override
    public void add(Item item) {
        
        if (this.item.getName().isEmpty()){
            this.item = item;
        }
        
            
    }

    @Override
    public boolean isInBox(Item item) {
        return this.item.getName().equals(item.getName());
    }
}
