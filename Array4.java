/*
 * Write s program to find frequency of the each element in the given array.
 * Test Case1:
 * input:[1,8,6,1,0,8]
 * output:
 * 1:2
 * 8:2
 * 6:1
 * 0:1
 * 
 * Test case2;
 * input:[2,2,3,3,2]
 * output:
 * 2:3
 * 3:2
 */

package Array_Prog;
import java.util.HashSet;
//import java.util.Hashset;
public class Array4 {
    public static void frequencyCount(int[] array){
        HashSet<Integer>hs = new HashSet<>();
        for(int i=0;i<array.length;i++){
            hs.add(array[i]);
        }
        for(int element:hs){
            int count = 0;
            for(int i =0;i<array.length;i++){
                if(element == array[i]){
                    count++;
                }
            }
            System.out.println((element+" : "+count));
        }
    }

    public static void main(String[] args){
        int[] a = {1,8,6,1,0,8};
        frequencyCount(a);
    }

    
}
