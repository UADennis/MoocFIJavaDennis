
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis Mayer
 */
public class Employees {

    private ArrayList<Person> emp = new ArrayList<>();

    public Employees() {

    }

    public void add(Person personToAdd) {
        emp.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        emp.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> it = emp.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public void print(Education education) {
        Iterator<Person> it = emp.iterator();
        while(it.hasNext()){
            
            Person temp = it.next();
            if(temp.getEducation().equals(education)){
                System.out.println(temp);
            }
        
            }
        }

    public void fire(Education education) {
        Iterator<Person> it = emp.iterator();
        while(it.hasNext()){
            if(it.next().getEducation().equals(education)){
                it.remove();
            }
        }

    }

}


