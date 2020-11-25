/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class CD implements Packable{
    
    private String CDName;
    private String authorOfCD;
    private double weightOfCD;
    private int pubYear;
    
    public CD(String authorOfCD, String CDName, int pubYear){
        this.authorOfCD = authorOfCD;
        this.CDName = CDName;
        this.weightOfCD = 0.1;
        this.pubYear = pubYear;
    }

    @Override
    public double weight() {
        return this.weightOfCD;
    }
    @Override
    public String toString() {
        return this.authorOfCD+": "+this.CDName+" ("+this.pubYear+")";
    }
    
}
