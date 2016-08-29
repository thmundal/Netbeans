/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering4;

/**
 *
 * @author Thomas
 */
public class util {
    /**
     * Calculates the factorial of input number
     * @param n The number to calculate factorial of
     * @return int The result of the calculation
     */
    public static int factorial(int n) {
        int k = n;
        for(int i = 1; i<n; i++) {
            k *= i;
        }
        return k;
    }
    
    
    /**
     * Check a number to see if it is a prime
     * @param n The number to check
     * @return boolean
     */
    public static boolean isPrime(int n) {
        if(n <= 1)
            return false;
        else if(n <= 3)
            return true;
        else if(n % 2 == 0 || n % 3 == 0)
            return false;
        
        double i = 5;
        while(Math.pow(i, 2) <= n) {
            if(n % 2 == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        
        return true;
    }
    
    /**
     * Check if a string is a numeric value
     * @param n The string to check
     * @return boolean
     */
    public static boolean isNumeric(String n) {
        try {
            Integer.parseInt(n);
        } catch(Exception e) {
            return false;
        }
        
        return true;
    }
    
    /**
     * Testing if input is a number and is a prime
     * @param input String
     */
    private static void primeTest(String input) {
        if(isNumeric(input)) {
            int n = Integer.parseInt(input);
            if(isPrime(n)) {
                System.out.println(input + " is a prime");
            } else {
                System.out.println(input + " is not a prime");
            }
        } else {
            System.out.println("Please enter a numeric value");
        }
    }
}
