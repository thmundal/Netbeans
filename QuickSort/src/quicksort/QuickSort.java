/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;


/**
 *
 * @author Thomas
 */
public class QuickSort {
    int[] intArray;
    public QuickSort() {
        
    }
    
    public ArrayList sortInt(ArrayList arr) {
        ArrayList out = new ArrayList(arr.size());
        
        int max = (int) Collections.max(arr);
        int min = (int) Collections.min(arr);
        int median = (max + min) / 2;
        
        System.out.println(max);
        System.out.println(min);
        System.out.println(median);
        return out;
    }
    /*
    public static void quickSort(int[] n, int lo, int hi) {
        if(lo < hi) {
            int p = partition(n, lo, hi);
            quickSort(n, lo, p - 1);
            quickSort(n, p + 1, hi);
        }
    }
    
    public static int partition(int[] n, int lo, int hi) {
        int pivot = n[hi];
        int i = lo;
        
        for(int j = lo; lo < hi - 1;) {
            if(n[i] <= pivot) {
                // Swap n[i] with n[j]
                int temp = n[i];
                n[i] = n[j];
                n[j] = temp;
            }
        }
        int temp = n[i];
        n[i] = n[hi];
        n[hi] = temp;
        
        return i;
    }*/
}
