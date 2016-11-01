/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering7;

import java.util.Scanner;
import innlevering6.Konto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
/**
 *
 * @author 888651
 */
public class minibank {
    private Konto[] account_list;
    private Scanner in;
    private Konto active_account;
    BankGUI gui;
    boolean logged_in;
    ActionListener default_button_listener;
    ActionListener new_account_button_listener;
    ActionListener withdraw_button_listener;
    ActionListener deposit_button_listener;
    
    /**
     * Sets up the minibank with a given array of accounts. Also creates the different modes for the button in the GUI
     * @param acc_list 
     */
    public minibank(Konto[] acc_list) {
        account_list = acc_list;
        in = new Scanner(System.in);
        gui = new BankGUI();
        
        welcome();
        
        default_button_listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String input = gui.getInput();
                    int num = java.lang.Integer.parseInt(input);
                    
                    if(!logged_in) { 
                        if(num - 1 <= account_list.length) {
                            logged_in = true;

                            active_account = account_list[num];
                            displayMenu("");
                        } else {
                            gui.output("Ugyldig kontonummer");
                        }
                    } else {
                        doAction(num);
                    }
                } catch(Exception ex) {
                    gui.output("Vennligst skriv inn et tall");
                }
                
                gui.setInput("");
            }
        };
        
        withdraw_button_listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String input = gui.getInput();
                    int amount = java.lang.Integer.parseInt(input);
                    
                    if(active_account.hasMoney(amount)) {
                        active_account.withdrawMoney(amount);

                        displayMenu("Ny balanse er " + active_account.getBalance());
                    } else {
                        displayMenu("Du har ikke nok penger på konto");
                    }
                    
                    gui.removeButtonListener(withdraw_button_listener);
                    gui.setButtonListener(default_button_listener);
                } catch(Exception ex) {
                    gui.output("Vennligst skriv inn et tall");
                }
                
                gui.setInput("");
            }
        };
        
        deposit_button_listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String input = gui.getInput();
                    int amount = java.lang.Integer.parseInt(input);
                    
                    if(amount > 0) {
                        active_account.depositMoney(amount);
                        displayMenu("Ny saldo er " + active_account.getBalance());
                    } else {
                        displayMenu("Kan ikke sette inn " + amount +" kroner");
                    }
                    
                    gui.removeButtonListener(deposit_button_listener);
                    gui.setButtonListener(default_button_listener);
                } catch(Exception ex) {
                    gui.output("Vennligst skriv inn et tall");
                }
                
                gui.setInput("");
            }
        };
        
        new_account_button_listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = gui.getInput();
                    
                    
                    Konto k = new Konto();
                    k.setName(name);

                    Konto[] new_accounts = new Konto[account_list.length + 1];
                    new_accounts[new_accounts.length - 1] = k;

                    System.arraycopy(account_list, 0, new_accounts, 0, account_list.length);

                    account_list = new_accounts;

                    displayMenu("Ditt nye kontonummer er " + (account_list.length - 1));
                    
                    gui.removeButtonListener(new_account_button_listener);
                    gui.setButtonListener(default_button_listener);
                } catch(Exception ex) {
                    
                }
                
                gui.setInput("");
            }
        };
        
        gui.setButtonListener(default_button_listener);
        
    }
    
    /**
     * Displays the menu followed by a custom text message
     * @param add 
     */
    public void displayMenu(String add) {
        String output_text = "Velkommen " + active_account.getOwner() + "\n"
                + "Velg Funksjon\n"
                + "1. Se saldo\n"
                + "2. Ta ut penger\n"
                + "3. Sett inn penger\n"
                + "4. Legg til konto\n"
                + "0. Logg ut\n\n";

        gui.output(output_text + add);
    }
    
    /**
     * Perform an action based on the input given
     * @param n 
     */
    public void doAction(int n) {
        switch(n) {
            case 1:
                // Se saldo
                
                displayMenu("Din saldo er " + active_account.getBalance());
                break;
                
            case 2:
                withdraw();
                break;
                
            case 3:
                deposit();
                break;
            case 4:
                addAccount();
                break;
                
            case 0:
            default:
                welcome();
                
                //gui.exit();
                logged_in = false;
                break;
        }
        
        if(n < 5) {
            //displayMenu(active_account);
        }
    }
    
    /**
     * Sets the withdraw button listener
     */
    public void withdraw() {
        gui.output("Angi uttakssum: ");
        gui.removeButtonListener(default_button_listener);
        gui.setButtonListener(withdraw_button_listener);
    }
    
    /**
     * Sets the deposit button listener
     */
    public void deposit() {
        gui.output("Angi sum å sette inn:");
        gui.removeButtonListener(default_button_listener);
        gui.setButtonListener(deposit_button_listener);
    }
    
    /**
     * Sets the add account button listener
     */
    public void addAccount() {
        gui.output("Skriv inn navn på kontoeier:");
        gui.removeButtonListener(default_button_listener);
        gui.setButtonListener(new_account_button_listener);
    }
    
    /**
     * Display the list of accounts at the output field
     */
    public void accountInfo() {
        System.out.println("Velg din konto");
        printAccounts();

        Konto acc = account_list[in.nextInt()];
        acc.writeInfo();
    }
    
    /**
     * Returns a text-formatted string representing the list of accounts
     * @return 
     */
    public String printAccounts() {
        String output_text = "";
        for(int i=0; i<account_list.length; i++) {
            output_text += i + ": "+account_list[i].getOwner() +"\n";
        }
        return output_text;
    }
    
    /**
     * Outputs the welcome-text/first screen of the minibank
     */
    private void welcome() {
        String account_list = printAccounts();
        gui.output("Velkommen til 1337 bank, vennligt velg ditt kontonummer\n\n" + account_list);
    }
}
