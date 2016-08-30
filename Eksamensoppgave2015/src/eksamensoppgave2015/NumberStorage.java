/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksamensoppgave2015;

/**
 *
 * @author Thomas
 */
public class NumberStorage {
    int[] numbers;
    
    public NumberStorage() {
        numbers = new int[25];
        for(int i=0; i<numbers.length; i++) {
            int rand = (int) Math.floor(Math.random() * numbers.length + 1);
            numbers[i] = rand;
        }
        
        System.out.println(java.util.Arrays.toString(numbers));
    }
    
    /**
     * Sorting an array using the standard bubble-sort algorithm
     */
    public void sortArray() {
        boolean swapped = true;
        
        while(swapped) {                            // As long as a swapping has occurred, repeat
            swapped = false;                        // Say that no swap has occurred yet, this pass
            for(int i=1; i<numbers.length-1; i++) { // Loop trough the array that we want to sort
                if(numbers[i-1] > numbers[i]) {     // If the element before the current element is larger then
                    int temp = numbers[i-1];        // Begin swapping process by remembering one of the values
                    numbers[i-1] = numbers[i];      // Swap values
                    numbers[i] = temp;              // Finish the swap
                    swapped = true;                 // Say that at least one swap occured this pass
                }
            }
        }
        
        System.out.println(java.util.Arrays.toString(numbers)); // Print the sorted array
    }
    
}
