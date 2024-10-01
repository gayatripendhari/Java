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
public class Array4a{
    public static int[] removeDuplicates(int[] array){
        int[] newArray = new int[array.length];

        newArray[0]=array[0];
        int k=1;

        for(int i=1;i<array.length;i++){
            int j=0;
            for(;j<k;j++){
                if(array[i]==newArray[j]){
                break;
            }
        }
        if(j==k){
            newArray[k++]=array[i];
        }
    }
    int[] b = new int[k];
    for(int i=0;i<k;i++){
        b[i]=newArray[i];
    }
    return b;
    }
    public static void main(String[] args) {
        int[] a={4,5,9,1,5,9,3,4,6};
        int[] b= removeDuplicates(a);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]+" ,");
        }

    }
}