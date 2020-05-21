package mergesort;

import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        int numbers[] = new int [12];
        int find;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        System.out.print("Input 12 integers you would like to quick sort: ");
        for(int i = 0; i <12; i++)
                {
                   numbers[i] = keyboard.nextInt();
                }
        mergeMethod sorted = new mergeMethod(); 
        sorted.sort(numbers, 0, numbers.length-1);
        System.out.print("The new sorted array is: ");
        for(int i = 0; i < 12; i++)
                {
                   System.out.print(numbers[i]+" ");
                }
        System.out.print("\nInput the integer you would like to find: ");
        find = keyboard.nextInt();
        BinarySearch ob = new BinarySearch();
        int result = ob.binarySearch(numbers, 0, numbers.length- 1, find); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    }
    
}
