/*
Write a method to return the count of even elements in the given integer array

test case1:
input :[1,6,9,0,25,16]
output:3

test case2:
input:[4,78,98,87,120]
output:4

test case3:
input:[5,-24,47,-21,58]
output:1
*/

package Array_Prog;

public class Array1 {
    public static int evenCount(int[] array) {
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a={2,3,4,5};
        System.out.println(evenCount(a));
    }
    
}
