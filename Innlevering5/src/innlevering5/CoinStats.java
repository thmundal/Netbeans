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
public class CoinStats {
    private Coin coin;
    private String history;
    
    public CoinStats() {
        history = "";
        coin = new Coin();
    }
    
    public boolean flipCoin() {
        addResult(coin.flip());
        return true;
    }
    
    public boolean getFace() {
        return coin.getFace();
    }
    
    private void addResult(boolean result) {
        String facename = "";
        if(result)
            facename = "H";
        else
            facename = "T";
        history += facename;
    }
    
    public String getHistory() {
        return history;
    }
    
    public int checkSequence(String seq) {
        String h = getHistory();
        
        int hits = 0;
        int pos = 0;
        
        while(h.indexOf(seq) > -1) {
            hits++;
            h = h.substring(h.indexOf(seq) + seq.length(), h.length());
            
            // Safeguard, do not check over 1k times....... Should not happen
            if(hits > 1000)
                break;
        }
        return hits;
    }
}
