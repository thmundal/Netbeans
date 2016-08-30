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
public class Account {
    double balance;
    String owner;
    
    /**
     * Constructor
     * @param inbalance
     * @param inowner 
     */
    public Account(double inbalance, String inowner) {
        balance = inbalance;
        owner = inowner;
    }
    
    /**
     * Set the name of the owner on the account
     * @param name 
     */
    public void setName(String name) {
        owner = name;
    }
    
    /**
     * Adds a number to the balance member, if the given amount is above 0
     * @param amount 
     */
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }
    
    /**
     * Subtracts an amount from the balance memeber variable if the amount is not greater than the balance value
     * @param amount 
     */
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    /**
     * Prints the value of the balance memeber variable to the console
     */
    public void displayBalance() {
        System.out.println(balance);
    }
    
    /**
     * Returns the value of the balance memeber variable
     * @return 
     */
    public double getBalance() {
        return balance;
    }
}
