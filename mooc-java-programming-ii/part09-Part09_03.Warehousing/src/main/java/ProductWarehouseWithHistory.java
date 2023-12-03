/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory histo = new ChangeHistory();
 
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        histo.add(initialBalance);
        
    }
    
    public String history(){
        return histo.toString();
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        histo.add(this.getBalance());
    }
    public double takeFromWarehouse(double amount){
        histo.add(this.getBalance() - amount);
        return super.takeFromWarehouse(amount);
        
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + histo.toString());
        System.out.println("Largest amount of product: " + histo.maxValue());
        System.out.println("Smallest amount of product: " + histo.minValue());
        System.out.println("Average: " + histo.average());
        
    }
    
        
    
    
}
