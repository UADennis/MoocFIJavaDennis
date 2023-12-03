/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis Mayer
 */
public class CustomTacoBox implements TacoBox {

    private int tacoCount;

    public CustomTacoBox(int tacoCount) {
        this.tacoCount = tacoCount;
    }

    @Override
    public int tacosRemaining() {
        return tacoCount;
    }

    @Override
    public void eat() {
        if(tacoCount == 0){
            return;
        }
        tacoCount--;
    }
    
}
