/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering8;

/**
 *
 * @author 888651
 */
public class Tabell {
    private int[] tall;
    private int limit = 10;
    
    public Tabell() {
        tall = new int[limit];
        
        for(int i=0; i<limit; i++) {
            tall[i] = (int) (Math.random() * 100 + 1);
        }
    }
    
    public void sort() {
        boolean swap = true;
        
        while(swap) {
            swap = false;
            for(int i=1; i<tall.length; i++) {
                if(tall[i] < tall[i-1]) {
                    int tmp = tall[i];
                    tall[i] = tall[i-1];
                    tall[i-1] = tmp;
                    swap = true;
                }
            }
        }
    }
    
    public void printArray() {
        System.out.println(java.util.Arrays.toString(tall));
    }
}
