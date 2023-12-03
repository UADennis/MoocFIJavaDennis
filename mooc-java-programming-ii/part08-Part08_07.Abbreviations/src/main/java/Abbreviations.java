
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
public class Abbreviations {

    HashMap<String, String> save = new HashMap<>();

    public Abbreviations() {

    }

    public void addAbbreviation(String abbreviation, String explanation) {
        String test = sauber(abbreviation);
        save.put(test, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        String test = sauber(abbreviation);
        return save.containsKey(test);
    }
    
    public String findExplanationFor(String abbreviation){
        String test = sauber(abbreviation);
        return save.get(test);
    }

    public static String sauber(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();

    }
}
