/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering7;

import innlevering6.Konto;
import java.util.Scanner;

/**
 *
 * @author thmun
 */
public class Innlevering7 {

    /**
     * @param args the command line arguments
     */
    private static Konto[] accounts;
    private static Scanner in;
    public static void main(String[] args) {
        // Create some arbitrary accounts
        String[] names = {"Thomas", "Emil", "Sondre", "Steffen", "jan Olav", "Martin", "Marte", "Tone Marie", "Knut", "Nils"};
        
        accounts = new Konto[10];
        // Fill the accounts with names and a random deposited value
        for(int i=0; i<accounts.length; i++) {
            accounts[i] = new Konto();
            accounts[i].setName(names[i]);
            accounts[i].setBalance((int) Math.floor(Math.random() * 10000 + 1));
        }
        
<<<<<<< HEAD
        /*in = new Scanner(System.in);
        int menunum = 1;
        
        do{  
            try {
                
            } catch(Exception e) {
                System.out.println("Please provide a number");
            }
            
        } while(menunum > 0);*/
        
        BankGUI gui = new BankGUI();
        minibank bank = new minibank(accounts, gui);
        
=======
        // Initialize the bank here
        minibank bank = new minibank(accounts);
>>>>>>> 26b0b1d15c4346bd2cca99055312c27b93bc1eb4
    }
}
