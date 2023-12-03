
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis Mayer
 */
public class Stack {

    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        this.list.add(value);
    }

    public ArrayList<String> values() {
        ArrayList<String> output = new ArrayList<>();
        for (String item : this.list) {
            output.add(item);

        }
        return output;
    }

    public String take() {
        return this.list.remove(this.list.size() - 1);

    }

}
