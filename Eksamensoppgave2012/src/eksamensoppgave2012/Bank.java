/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eksamensoppgave2012;
/**
 *
 * @author Thomas
 */
public class Bank {
    /**
     * List of accounts in this bank
     */
    Account[] accounts;
    
    /**
     * Constructor for the bank object, creates 10 accounts with owners and a random balance
     */
    public Bank() {
        accounts = new Account[10];
        String[] names = new String[]{"Bjarne", "Per", "Nils", "Knut", "Siri", "Trude", "Inger", "Ole", "Torleif", "Anette"};
        
        for(int i=0; i<accounts.length; i++) {
            accounts[i] = new Account(Math.random() * 100 + 1, names[i]);
        }
    }
    
    /**
     * Sums the balance of all the accounts in the bank, and dispays them formatted to the console
     */
    public void sumAccountBalance() {
        double balance = 0;
        for(int i=0; i<accounts.length; i++) {
            if(accounts[i] != null) {
                balance += accounts[i].getBalance();
            }
        }
        System.out.println("Total amount deposited in bank: " + String.format("%.2f", balance));
    }
}
