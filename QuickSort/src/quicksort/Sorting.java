/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class Sorting {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        
        for(int i=0; i<100; i++) {
            arr.add((int) (Math.random() * 100));
        }
        
        System.out.println(java.util.Arrays.toString(arr.toArray()));
        
        QuickSort s = new QuickSort();
        s.sortInt(arr);
    }
}
