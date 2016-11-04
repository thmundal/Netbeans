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
public class Tall {
    private int tall1;
    private int tall2;
    
    public Tall() {
        tall1 = 5;
        tall2 = 4;
    }
    
    public void byttOm() {
        int temp = tall1;
        tall1 = tall2;
        tall2 = temp;
    }
}
