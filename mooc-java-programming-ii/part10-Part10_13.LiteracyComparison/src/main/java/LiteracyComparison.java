
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        ArrayList<Literacy> data = new ArrayList<>();
        
        try {
            Scanner reader = new Scanner(Paths.get("literacy.csv"));
            while(reader.hasNext()){
                String zeile = reader.nextLine();
                String[] pieces = zeile.split(",");
                if(pieces[2].contains("female")){
                    pieces[2] = "female";
                }else{
                    pieces[2] = "male";
                }
                
                data.add(new Literacy(pieces[3],pieces[4], pieces[2], Double.parseDouble(pieces[5])));
                
                
            }
        } catch (IOException ex) {
            Logger.getLogger(LiteracyComparison.class.getName()).log(Level.SEVERE, null, ex);
        }
        data.stream().sorted().forEach(p -> System.out.println(p));
        
        
        
        
          
        
        
        

    }
}
