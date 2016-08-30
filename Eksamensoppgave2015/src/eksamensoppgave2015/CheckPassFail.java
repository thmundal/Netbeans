/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksamensoppgave2015;

/**
 *
 * @author Thomas
 */
public class CheckPassFail {
    public CheckPassFail(String[] args) {
        int mark = 49;
        
        System.out.println("Mark is " + mark);
        
        if(mark >= 50){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
