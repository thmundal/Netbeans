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
public class Coin {
    private boolean face;
    
    public boolean flip() {
        return (Math.floor(Math.random() * 10) + 1) > 5 ? true:false;
    }
    
    public boolean getFace() {
        return face;
    }
}
