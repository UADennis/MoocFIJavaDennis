
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class IOU {
    
    private HashMap<String, Double> debtList = new HashMap<>();
    
    public IOU(){
        
    }
    public void setSum(String toWhom, double amount){
        debtList.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        if(!debtList.containsKey(toWhom)){
            return 0;
        } else {
            return debtList.get(toWhom);
        }
    }
    
    
    
}
