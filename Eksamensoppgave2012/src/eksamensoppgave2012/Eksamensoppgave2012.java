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
public class Eksamensoppgave2012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] chr = "Jeg elsker julenissen".toCharArray();
        System.out.println(chr[0]);
        System.out.println(chr[5]);
        System.out.println(chr[6]);
        System.out.println(chr[9]);
        System.out.println(chr[10]);
        System.out.println(chr[12]);
        System.out.println(chr[16]);
        System.out.println("Kan ikke skrive ut bokstav på plass 21, fordi et array starter alltid på 0. Siste index er alltid Array.length - 1");
        
        String str = new String(chr);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(9));
        System.out.println(str.charAt(10));
        System.out.println(str.charAt(12));
        System.out.println(str.charAt(16));
        
        Fibonacci fib = new Fibonacci(22);
        fib.count();
        
        Bank bank = new Bank();
        bank.sumAccountBalance();
    }
    
}
