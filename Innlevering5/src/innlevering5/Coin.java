/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering5;
import java.util.Random;

/**
 * A class representing a coin that can perform a flip and return which face it fell on
 * @author Thomas
 */
public class Coin {
    /**
     * boolean value representing the current face. true represents heads, false represents tails
     */
    private boolean face;
    
    /**
     * A random object to perform random selection
     */
    private Random r;
    
    /**
     * Initialize the random object
     */
    public Coin() {
        r = new Random();
    }
    
    /**
     * Performs a coin flip with 50% chance of returning true or false representing the face returned
     * @return boolean returned by Random::nextBoolean() - courtesy of Sondre
     */
    public boolean flip() {
        return r.nextBoolean();
    }
    
    /**
     * Returns the current face
     * @return true for heads, false for tails
     */
    public boolean getFace() {
        return face;
    }
}
