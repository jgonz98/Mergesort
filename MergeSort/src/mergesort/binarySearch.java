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
class BinarySearch { 
    int binarySearch(int arr[], int left, int right, int find) 
    { 
        if (right >= left) { 
            int mid = left + (right - left) / 2; 
            if (arr[mid] == find) 
                return mid; 
            if (arr[mid] > find) 
                return binarySearch(arr, left, mid - 1, find); 
            return binarySearch(arr, mid + 1, right, find); 
        } 
        return -1; 
    } 
}
