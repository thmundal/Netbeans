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
public class Innlevering4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Oppgave 1
        System.out.println("Oppgave 1");
        Task4_1();
        System.out.println();
        
        // Oppgave 2
        System.out.println("Oppgave 2:");
        Task4_2();
        System.out.println();
        
        // Oppgave 3
        System.out.println("Oppgave 3");
        Task4_3();
        System.out.println();
        
        // Oppgave 4
        System.out.println("Oppgave 4");
        System.out.println(HelloWorld());
        System.out.println();
        
        // Oppgave 6
        System.out.println("Oppgave 6 (For enkelhelts skyld, har jeg det i samme prosjekt og fil)");
        int[] array = createArray(10);      // Create an array with 10 elements
        int[] sortedArray;

        printArray(array);                  // Prints array
        sortedArray = bubbleSort(array);    // Sort array

        printArray(sortedArray);            // Print sorted array
        printArray(array);                  // Print the original array
        
        int[] copiedArray = copyArray(array);   // Make a copy of an array
        printArray(copiedArray);                // Print the copy
        
        copiedArray[0] = 123456;                // Change a value
        printArray(array);                      // Check that the original array is left alone
    }

    public static void Task4_1() {
        for (int i = 0; i < 10; i++) {
            if (isPrime(i) && i != 29 && i != 59 && i != 61) {
                System.out.println(i);
            }
        }
    }

    public static void Task4_2() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Skriv inn en tekst-streng");
        String input1 = in.next();
        System.out.println("Skriv inn en tekst-streng til");
        String input2 = in.next();

        System.out.println("Sammenligner strengene leksografisk");
        int compareTo = input1.compareTo(input2);
        System.out.println(compareTo);
    }

    public static void Task4_3() {
        String[] strings;
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Angi størrelse på array:");
        String size;
        
        boolean valid = false;
        
        do {
            size = in.next();
            if (util.isNumeric(size)) {
                int sizeint = java.lang.Integer.parseInt(size);
                strings = new String[sizeint];

                for (int i = 0; i < strings.length; i++) {
                    System.out.println("Angi verdi for element " + i + ":");
                    strings[i] = in.next();
                }

                System.out.println("Sorterer array");
                String[] sorted_strings = bubbleSort(strings);
                System.out.println("Sortert string-array:");
                System.out.println(java.util.Arrays.toString(sorted_strings));

                System.out.println("Original array var:");
                System.out.println(java.util.Arrays.toString(strings));
                valid = true;
            } else {
                System.out.println("Du skrev ikke inn et tall, prøv igjen");
            }
        } while(!valid);
    }

    /**
     * Creates an array with n elements and fills it with random numbers from 1
     * to 100
     *
     * @param n
     * @return The generated array
     */
    public static int[] createArray(int n) {
        int[] array = new int[n];                       // Initialize array with n size

        for (int i = 0; i < n; i++) {                    // Fill the array with random numbers
            array[i] = (int) Math.floor(Math.random() * 100) + 1;
        }

        return array;
    }

    /**
     * Prints the contents of a one-dimensional array to the console
     * 
     * @param array The array to print
     */
    public static void printArray(int[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }
    
    /**
     * Returns a copy of an array
     * @param array
     * @return 
     */
    public static int[] copyArray(int[] array) {
        int[] out = new int[array.length];
        
        for(int i=0; i<array.length; i++) {
            out[i] = array[i];
        }
        return out;
    }

    /**
     * Sorts an array using bubble sort algorithm
     *
     * @param input Array to sort
     * @return Returns the sorted array
     */
    public static int[] bubbleSort(int[] input) {
        boolean swapping = true;
        int[] sorted_array = input.clone();                     // Clone the original array, so that we do not overwrite the values
        // Why does Java do this without passing by reference explicitly?

        /*  Do a while loop until no swapping has occurred.
            If there was not a swap on the last pass, the array is fully sorted
         */
        while (swapping) {
            swapping = false;                                   // No swapping has occurred yet
            for (int i = 1; i < sorted_array.length; i++) {        // Loop trough the elements of the array
                if (sorted_array[i - 1] > sorted_array[i]) {       // If the first element has a greater value than the next, do a swap
                    int temp = sorted_array[i - 1];               // Remember original value
                    sorted_array[i - 1] = sorted_array[i];        // Swap values
                    sorted_array[i] = temp;                     // Recover original value to the swapped variable
                    swapping = true;                            // Flag that a swapping has occured
                }
            }
        }
        return sorted_array;
    }

    public static String[] bubbleSort(String[] input) {
        boolean swapping = true;
        String[] sorted_array = input.clone();                     // Clone the original array, so that we do not overwrite the values
        // Why does Java do this without passing by reference explicitly?

        /*  Do a while loop until no swapping has occurred.
            If there was not a swap on the last pass, the array is fully sorted
         */
        while (swapping) {
            swapping = false;                                   // No swapping has occurred yet
            for (int i = 1; i < sorted_array.length; i++) {        // Loop trough the elements of the array
                if (sorted_array[i - 1].compareTo(sorted_array[i]) > 0) {       // If the first element has a greater value than the next, do a swap
                    String temp = sorted_array[i - 1];               // Remember original value
                    sorted_array[i - 1] = sorted_array[i];        // Swap values
                    sorted_array[i] = temp;                     // Recover original value to the swapped variable
                    swapping = true;                            // Flag that a swapping has occured
                }
            }
        }
        return sorted_array;
    }
    
    /**
     * Check a number to see if it is a prime
     *
     * @param n The number to check
     * @return boolean
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        double i = 5;
        while (Math.pow(i, 2) <= n) {
            if (n % 2 == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }
    
    public static String HelloWorld() {
        return "Hello World";
    }
    
    /**
     * Reverse the contents of an array
     * @param arr The array to reverse
     * @return The resulting array
     */
    public int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
}
