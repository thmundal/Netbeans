/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering5;

/**
 * A class for rolling coin flips and storing the results, and perform actions on the result history.
 * @author Thomas
 */
public class CoinStats {
    /**
     * The Coin object to perform rolls on
     */
    private Coin coin;
    
    /**
     * A string containing the history of what has been rolled
     */
    private String history;
    
    /**
     * An integer representing the number of heads rolled
     */
    private int num_heads;
    
    /**
     * And integer representing the number of tails rolled
     */
    private int num_tails;
    
    /**
     * Initialising the coin object, and setting the history to an empty string
     */
    public CoinStats() {
        history = "";
        coin = new Coin();
    }
    
    /**
     * Flip the coin stored in CoinStats, add and return the result
     * @return 
     */
    public boolean flipCoin() {
        boolean r = coin.flip();
        addResult(r);
        return r;
    }
    
    /**
     * Return the current face of the coin stored in this object
     * @return true  for heads, false for tails
     */
    public boolean getFace() {
        return coin.getFace();
    }
    
    /**
     * Adds the result of a coinflip
     * @param result boolean value representing the result to store, true for heads, false for tails.
     */
    private void addResult(boolean result) {
        String facename = "";
        if(result) {
            facename = "H";
            num_heads++;
        } else {
            facename = "T";
            num_tails++;
        }
        history += facename;
    }
    
    /**
     * Return the history string. The history string contains 
     * all the result concatinated.
     * @example HHTHTHHTHHTHTHH
     * @return String containing the history
     */
    public String getHistory() {
        return history;
    }
    
    /**
     * Checks the history for a given sequence. It will count all the 
     * occurances of seq in the history string.
     * @param seq The sequence to check for
     * @return An integer representing how many occurances of this sequence in the history
     */
    public int checkSequence(String seq) {
        String h = getHistory();
        
        int hits = 0;
        int pos = 0;
        
        if(seq.length() > 0) {
            while(h.indexOf(seq) > -1) {
                hits++;
                h = h.substring(h.indexOf(seq) + seq.length(), h.length());

                // Safeguard, do not check over 1k times....... Should not happen
                if(hits > 1000)
                    break;
            }
        }
        return hits;
    }
    
    /**
     * Returns the number of times heads was rolled
     * @return Integer representing the count
     */
    public int numHeads() {
        return num_heads;
    }
    
    /**
     * Returns the number of times tails was rolled
     * @return Integer representing the count
     */
    public int numTails() {
        return num_tails;
    }
}
