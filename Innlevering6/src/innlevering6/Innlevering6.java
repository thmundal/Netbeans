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
public class Innlevering6 {
    private static Konto account;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        account = new Konto();
        account.setName("Thomas Mundal");
        account.setBalance(100);
        account.writeInfo();
        
        System.out.println("---------------------------");
        
        Konto acc2 = new Konto();
        acc2.setName("Emil");
        acc2.setBalance(-50000);
        acc2.writeInfo();
        
        account.depositMoney(-150);
        account.withdrawMoney(50);
        
        System.out.println(account.getBalance());
        System.out.println(acc2.getBalance());
        
    }
    
}
