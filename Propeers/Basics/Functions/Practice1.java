// Problem statement
// Given a number N, print sum of all even numbers from 1 to N.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
//  1 <= N <= 10ˆ4 
// Sample Input 1 :
//  6
// Sample Output 1 :
// 12
// Explanation of Sample Input 1:
// The even numbers from 1 to 6 are: 2, 4, 6, So adding these 3 numbers give a sum of 12.
package Functions;

public class Practice1 {
    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;

        }
        System.out.println(sum);
    }
}
