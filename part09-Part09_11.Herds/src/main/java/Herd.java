
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Herd implements Movable {
    private List<Organism> list;
    
    public Herd(){
        this.list = new ArrayList<Organism>();
    }
    
    public void addToHerd(Movable movable){
        this.list.add((Organism) movable);
    }
    
    public String toString(){
        if (!(list.isEmpty())){
            String s = list.get(0).toString();

            for (int i=1; i<list.size();i++){
                s= s +"\n"+list.get(i).toString();
            }
            return s;
        } else {
            return "";
        }
    }
    
    public void move(int dx, int dy){
        for (int i = 0; i<list.size();i++){
            list.get(i).move(dx, dy);
        }
    }
    
}
