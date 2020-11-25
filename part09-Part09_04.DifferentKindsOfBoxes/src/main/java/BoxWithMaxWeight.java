
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
       
        this.capacity = capacity;
        this.items = new ArrayList<Item>();
    }

    @Override
    public void add(Item item) {
        int j = 0;
        
        for (int i = 0; i<items.size(); i++){
            j = j + items.get(i).getWeight();
        }
        
        if (item.getWeight()+j<=this.capacity){
            items.add(item);
        }
            
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
    
}
