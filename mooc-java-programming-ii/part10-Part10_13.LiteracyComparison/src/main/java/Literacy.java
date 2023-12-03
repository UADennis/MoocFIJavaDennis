/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class Literacy implements Comparable<Literacy> {
    
    private String country;
    private String date;
    private String gender;
    private double percentage;

    public Literacy(String country, String date, String gender, double percentage) {
        this.country = country;
        this.date = date;
        this.gender = gender;
        this.percentage = percentage;
    }
    
    

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    
    public String toString(){
        return this.country + " (" + this.date + "), " + this.gender + ", " + this.percentage;
    }

    @Override
    public int compareTo(Literacy o) {
        if(this.percentage - o.percentage > 0){
            return 1;
        } else if(this.percentage == o.percentage){
            return 0;
        } else {
            return -1;
        }
    }
    
    
    
}
