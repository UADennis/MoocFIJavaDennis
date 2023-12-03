
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis Mayer
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> store = new HashMap<>();

    public StorageFacility() {

    }
    
    public void add(String unit, String item){
        store.putIfAbsent(unit, new ArrayList<String>());
        
        store.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        if(!store.containsKey(storageUnit)){
            return new ArrayList<String>();
        }
        return store.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item){
        store.get(storageUnit).contains(item);
        store.get(storageUnit).remove(item);
        if(store.get(storageUnit).isEmpty()){
            store.remove(storageUnit);
            
        }
    }
    
    public ArrayList<String> storageUnits(){
        Set<String> test = store.keySet();
        ArrayList<String> clean = new ArrayList<>();
        for(String s : test){
            if(!store.get(s).isEmpty())
                clean.add(s);
            
        }
        return clean;
        
    }
    
    
    
    
}
