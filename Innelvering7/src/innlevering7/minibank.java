/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering7;

import java.util.Scanner;
import innlevering6.Konto;
import javax.swing.JPanel;
/**
 *
 * @author 888651
 */
public class minibank {
    private Konto[] account_list;
    private Scanner in;
    private int account_number;
    private Konto active_account;
    private boolean running = false;
    
    public minibank(Konto[] acc_list) {
        account_list = acc_list;
        in = new Scanner(System.in);
        
        boolean valid = false;
        
        System.out.println("Velkommen til 1337 Bank");
        System.out.println("Vennligst skriv inn ditt kontonummer");
        
        while(!valid) {
            try {
                account_number = in.nextInt();

                if(account_number - 1 > account_list.length) {
                    throw new Exception("Kontonummer finnes ikke, vennligst prøv igjen");
                } else {
                    valid = true;
                }
            } catch(Exception e) {
                System.out.println("En feil skjedde, vennligst prøv på nytt");
                in.next();
                System.out.println("");
            }
        }
        
        running = true;
        //displayMenu(account_list[account_number]);
    }
    
    private void displayMenu(Konto ac, JPanel output) {
            active_account = ac;
            
            //output.
            
            /*while(running) {
                System.out.println("Velkommen " + active_account.getOwner());
                System.out.println("Velg funksjon");
                System.out.println("1. Se saldo");
                System.out.println("2. Ta ut penger");
                System.out.println("3. Sett inn penger");
                System.out.println("4. Legg til konto");
                System.out.println("5. Avslutt");

                try {
                    int n = in.nextInt();
                    doAction(n);
                } catch(Exception e) {
                    System.out.println("En feil skjedde, prøv igjen " +e.getMessage());
                    in.next();
                    System.out.println("");
                }
            }*/
    }
    
    public void doAction(int n) {
        switch(n) {
            case 1:
                // Se saldo
                System.out.println("Din saldo er " + active_account.getBalance());
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
                
            case 5:
            default:
                System.out.println("Velkommen tilbake");
                running = false;
                break;
        }
        
        if(n < 5) {
            //displayMenu(active_account);
        }
    }
    
    public void withdraw() {
        System.out.println("Angi uttakssum: ");
        int amount = in.nextInt();
        
        active_account.withdrawMoney(amount);
        System.out.println("Ny balanse er " + active_account.getBalance());
    }
    
    public void deposit() {
        System.out.println("Angi sum å sette inn:");
        int amount = in.nextInt();
        
        active_account.depositMoney(amount);
        System.out.println("Ny balanse er " + active_account.getBalance());
    }
    
    public void addAccount() {
        System.out.println("Skriv inn navn på kontoeier:");
        String name = in.next();
        
        Konto k = new Konto();
        k.setName(name);
        
        Konto[] new_accounts = new Konto[account_list.length + 1];
        new_accounts[new_accounts.length - 1] = k;
        
        System.arraycopy(account_list, 0, new_accounts, 0, account_list.length);
        
        account_list = new_accounts;
        
        System.out.println("Ditt nye kontonummer er " + (account_list.length - 1));
    }
    
    public void accountInfo() {
        System.out.println("Velg din konto");
        printAccounts();

        Konto acc = account_list[in.nextInt()];
        acc.writeInfo();
    }
    
    public void printAccounts() {
        for(int i=0; i<account_list.length; i++) {
            //accounts[i].writeInfo();
            //System.out.println("---------------------------------");
            System.out.println(i + ": "+account_list[i].getOwner());
        }
        
    }
}
