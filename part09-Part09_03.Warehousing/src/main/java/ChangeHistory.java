
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
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<Double>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public double maxValue(){
        if (history.isEmpty()){
            return 0;
        }
        double j = 0;
        for(int i = 0; i<history.size();i++){
            if (history.get(i)>j){
                j = history.get(i);
            }
        }
        return j;
    }
    
    public double minValue(){
        if (history.isEmpty()){
            return 0;
        }
        double j = 100000;
        for(int i = 0; i<history.size();i++){
            if (history.get(i)<j){
                j = history.get(i);
            }
        }
        return j;
    }
    
    public double average(){
        if (history.isEmpty()){
            return 0;
        }
        double j = 0;
        for(int i = 0; i<history.size();i++){
            j = j + history.get(i);
        }
        return j/history.size();
    }
        
    public String toString(){
        return this.history.toString();
    }
    
}
