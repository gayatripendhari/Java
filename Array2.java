/*
 * write a method to return the largest element in the given intger array
 * 
 test case1:
 input:[1,6,9,98,25,16]
 output:25

 test case2:
 input:[1,4,78,98,87,120]
 output:120

 test case3:
input:[5,-24,46,-20,98]
output:98
 */

package Array_Prog;

public class Array2 {
    public static int largest(int[] array){
        int largest = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] nums={ 5,-24,46,-20,98};
        System.out.println(largest(nums));

    }
    
}
