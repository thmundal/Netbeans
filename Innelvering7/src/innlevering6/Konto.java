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
    /**
     * Sets the balance of this account to given value
     * @param b The new value of the account balance
     */
    public void setBalance(int b) {
        balance = b;
    }

    // Oppgave 2
    /**
     * Set the name of the account owner
     * @param n The name as a string
     */
    public void setName(String n) {
        owner = n;
    }
    
    // Oppgave 3
    /**
     * Output the account information to console
     */
    public void writeInfo() {
        System.out.println("Account owner: " + owner);
        System.out.println("Account balance: " + balance);
    }
    
    // Oppgave 6
    /**
     * Return the current balance on this account
     * @return Current balance
     */
    public int getBalance() {
        return balance;
    }
    
    /**
     * Add a value to the account balance
     * @param amount A positive integer
     */
    public void depositMoney(int amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Cannot deposit a negative amount");
        }
    }
    
    /**
     * Subtract a value from the account balance
     * @param amount A positive integer
     */
    public void withdrawMoney(int amount) {
        if(amount > 0) {
            if(amount <= balance)
                balance -= amount;
            else
                System.out.println("You do not have sufficient funds");
        } else {
            System.out.println("Please provide a positive integer");
        }
    }
    
    public String getOwner() {
        return owner;
    }
}
