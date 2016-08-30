/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering5;

/**
 *
 * @author Thomas
 */
public class Innlevering5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CoinStats c = new CoinStats();
        
        for(int i=0; i<50; i++) {
            c.flipCoin();
        }
        
        System.out.println(c.getHistory());
        System.out.println("Checking for HHTH");
        System.out.println(c.checkSequence("HHTH"));
    }
    
}
