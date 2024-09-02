// Problem statement
// Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.



// Example:
// 'arr '= [1,2,3,4,5]
// 'k' = 1  rotated array = [2,3,4,5,1]
// 'k' = 2  rotated array = [3,4,5,1,2]
// 'k' = 3  rotated array = [4,5,1,2,3] and so on.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 8
// 7 5 2 11 2 43 1 1
// 2
// Sample Output 1:
// 2 11 2 43 1 1 7 5
// Explanation of Sample Input 1:
// Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
// Rotate 2 steps to the left: 2 11 2 43 1 1 7 5
// Sample Input 2:
// 4
// 5 6 7 8
// 3
// Sample Output 2:
// 8 5 6 7
// Explanation of Sample Input 2:
// Rotate 1 steps to the left: 6 7 8 5
// Rotate 2 steps to the left: 7 8 5 6
// Rotate 2 steps to the left: 8 5 6 7
// Expected Time Complexity:
// O(n), where ‘n’ is the size of the array ‘arr’ and ‘k’ is the number of rotations.
// Constraints:
// 1 <= 'n' <= 10^3
// 1 <= 'arr'[i] <= 10^9
// 1 <= 'k' < 'n'


// Hints:
// 1. For an index ‘i’, find where it lands after k swaps.
// 2. When performing rotation once observe how the positions of all elements change.
package MixedProblems;
import java.util.*;
public class Practice9 {
    public static void rotateArray(int[] arr, int k){
        int n = arr.length;
        ArrayList<Integer> copyArr = new ArrayList<Integer>();
        for(int i = 0; i<k; i++){
           copyArr.add(arr[i]);
        }
        // for(int i=0; i<arr.length-k; i++){
        //     arr[i] = arr[k];
        //     k++;
        // }
        
        // for(int i = k+1; i<arr.length; i++){
        //     arr[i] = copyArr[i];
        // }
        for(int value:arr){
            System.out.println(value);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,7,8,5};
        int k = 2;
        rotateArray(arr,k);
    }
}
