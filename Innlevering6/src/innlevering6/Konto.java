/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering6;

/**
 *
 * @author Thomas
 */
public class Konto {
    // Oppgave 1, lager egenskaper
    private int balance;
    private String owner;
    
    // Oppgave 2
    public void setBalance(int b) {
        balance = b;
    }
    
    // Oppgave 2
    public void setName(String n) {
        owner = n;
    }
    
    // Oppgave 3
    public void writeInfo() {
        System.out.println("Account owner: " + owner);
        System.out.println("Account balance: " + balance);
    }
    
    public int getBalance() {
        return balance;
    }
    
    /**
     * 
     * @param amount The amount to deposit
     */
    public void depositMoney(int amount) {
        if(amount > 0) {
            balance += amount;
        }
    }
    
    public void withdrawMoney(int amount) {
        if(amount <= balance)
            balance -= amount;
        else
            System.out.println("You do not have sufficient funds");
    }
}
