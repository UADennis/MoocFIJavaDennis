/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;
import mooc.ui.UserInterface;

/**
 *
 * @author Dennis Mayer
 */
public class ApplicationLogic {
    
    private UserInterface uii;
    
    public ApplicationLogic(UserInterface uii){
        this.uii = uii;
    }
    
    public void execute(int times){
        for(int i = 1; i <= times; i++){
            System.out.println("Application logic is working");
            uii.update();
        }
    }
    
}
