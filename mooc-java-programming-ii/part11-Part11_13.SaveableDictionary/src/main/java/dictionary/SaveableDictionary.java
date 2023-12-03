/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dennis Mayer
 */
public class SaveableDictionary {

    private HashMap<String, String> trans = new HashMap<>();
    private String fle;

    public SaveableDictionary() {
    }

    public SaveableDictionary(String file) {
        this.fle = file;
    }

    public void add(String words, String translation) {
        trans.putIfAbsent(words, translation);

    }

    public String translate(String word) {
        if (trans.containsKey(word)) {
            return trans.get(word);
        }

        if (trans.containsValue(word)) {

            for (Map.Entry<String, String> entry : trans.entrySet()) {
                if (entry.getValue().equals(word)) {
                    return entry.getKey();
                }

            }

        }
        return null;
    }

    public void delete(String word) {
        if (trans.containsKey(word)) {
            trans.remove(word);
        }

        if (trans.containsValue(word)) {
            
            Iterator<Map.Entry<String,String>> it = trans.entrySet().iterator();

            while(it.hasNext()){
              Map.Entry<String,String> crnt = it.next();
              if(crnt.getValue().equals(word)){
                  it.remove();
              }
            }
        }
    }

    public boolean load() {
        try {
            Scanner scan = new Scanner(Paths.get(fle));

            while (scan.hasNext()) {
                String input = scan.nextLine();
                String[] parts = input.split(":");
                trans.put(parts[0], parts[1]);
            }
            scan.close();

            return true;
        } catch (IOException ex) {
            Logger.getLogger(SaveableDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(fle);
            for (Map.Entry<String, String> entry : trans.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
            writer.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveableDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
