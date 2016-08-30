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
public class Fibonacci {
    private int size;
    private int[] seq;
    public Fibonacci(int n) {
        size = n;
        seq = new int[n];
    }
    
    public void count() {
        for(int n=0; n<size; n++) {
            int f = (n < 2) ? n : (seq[n - 1]) + (seq[n - 2]);
            seq[n] = f;
            System.out.println(f);
        }
        
        System.out.println(java.util.Arrays.toString(seq));
    }
    
    public int fib(int n) {
        return (n < 2) ? n : fib(n - 1) + fib(n - 2);
    }
}
