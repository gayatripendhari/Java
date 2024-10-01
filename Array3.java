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

public class Array3 {
    public static void frequencyCount(int[] array){
        int visited = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            int count=1;
            if(array[i]!=visited){
                for(int j=i+1;j<array.length;j++){
                    if(array[i]==array[j]){
                        count++;
                        array[j]=visited;
                    }
                }
                System.out.println(array[i]+" : "+count);
            }
    
        }
    
    }
    public static void main(String[] args){
        int[] a={1,8,6,1,0,8};
        frequencyCount(a);
    }

    
}
