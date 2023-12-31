
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dict = new HashMap<>();
    
    public DictionaryOfManyTranslations(){
        
    }
    
    public void add(String word, String translation){
        dict.putIfAbsent(word, new ArrayList<String>());
        dict.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if(!dict.containsKey(word)){
            return new ArrayList<String>();
        }
        return dict.get(word);
    }
    public void remove(String word){
        dict.remove(word);
    }
    
    
    
    
    
}
