

public class Checker {
    
    public boolean isDayOfWeek(String string){
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean allVowels(String string){
        if(string.matches("[aeiou]*")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean timeOfDay(String string) {
    // Define the regular expression pattern for valid time format
    String pattern = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$";

    // Use the matches method to check if the string matches the pattern
    return string.matches(pattern);
    }
}