/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author jmgon
 */
public class mergeMethod {
    void merge(int[] array, int left, int middle, int right) 
    { 
        int sizeLeft = middle - left + 1; 
        int sizeRight = right - middle; 

        int L[] = new int [sizeLeft]; 
        int R[] = new int [sizeRight]; 
  
        for (int i=0; i<sizeLeft; ++i) 
            L[i] = array[left + i]; 
        for (int j=0; j<sizeRight; ++j) 
            R[j] = array[middle + 1+ j]; 
  
        int i = 0, j = 0; 
  
        int index = left; 
        while (i < sizeLeft && j < sizeRight) 
        { 
            if (L[i] <= R[j]) 
            { 
                array[index] = L[i]; 
                i++; 
            } 
            else
            { 
                array[index] = R[j]; 
                j++; 
            } 
            index++; 
        } 
  
        while (i < sizeLeft) 
        { 
            array[index] = L[i]; 
            i++; 
            index++; 
        } 
  
        while (j < sizeRight) 
        { 
            array[index] = R[j]; 
            j++; 
            index++; 
        } 
    } 
  
    void sort(int arr[], int left, int right) 
    { 
        if (left < right) 
        { 
            int middle = (left+right)/2;   
            sort(arr, left, middle); 
            sort(arr , middle+1, right); 
            merge(arr, left, middle, right); 
        } 
    }
}
