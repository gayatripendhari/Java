package Array_Prog;
/*
 * Given an array of integers , write a menthod to remove  all duplicate elements from the array .
 * The method should return a new array that contain only the unique elements from the original array,
 * Maintaing thier original order.
 * 
 * Test Case1
 * input:[4,5,9,1,5,9,3,4,6]
 * Output:[4,5,9,1,3,6]
 * 
 * Test Case2
 * input:[2,2,3,3,2]
 * output:[2,3]
 * 
 */

import java.util.LinkedHashSet;

public class Array4b {
    public static LinkedHashSet<Integer>newArray = removeDuplicates(int[] array){
        for(int i=0;i<array.length;i++){
            newArray.add(array[i]);
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] a={4,5,9,1,5,9,3,4,6};
        System.out.println(removeDuplicates(a));
    }
    
}
