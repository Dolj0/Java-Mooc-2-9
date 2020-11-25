
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
public class Box implements Packable{
    private double maximumCapacity;
    private ArrayList<Packable> packables;
    private double packedWeight;
    
    public Box(double maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.packables = new ArrayList<>();
        this.packedWeight = 0;
    }
    
    public void add(Packable packable){
        
        double counter = 0;
        
        for (int i =0; i<packables.size();i++){
            counter = counter+packables.get(i).weight();
        }
        
        if (counter+packable.weight()<=maximumCapacity){
            packables.add(packable);
            packedWeight = packedWeight + packable.weight();
        } 
    }
        
    public double weight() {
        double counter = 0;
        for (int i =0; i<packables.size();i++){
            counter = counter+packables.get(i).weight();
        }
        return counter;
    }
    
    @Override
    public String toString(){
        return "Box: "+packables.size()+" items, total weight "+packedWeight+" kg";
    }
    
}
