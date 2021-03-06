/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory changeHistory = new ChangeHistory();
    
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        addToWarehouse(initialBalance);
            
    }
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }
    @Override
    public double takeFromWarehouse(double amount){
        double d = super.takeFromWarehouse(amount);
        changeHistory.add(super.getBalance());
        return d;
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+history());
        System.out.println("Largest amount of product: "+changeHistory.maxValue());
        System.out.println("Smallest amount of product: "+changeHistory.minValue());
        System.out.println("Average: "+changeHistory.average());
    }
    
    public String history(){
        return changeHistory.toString();
    }
}
