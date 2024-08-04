package SourceCode;
import java.util.ArrayList;

public class RichestCustomerWeath {
    public static void main(String[] args) {
        int[][] arr= {{1,9,3},{3,2,1}};
        ArrayList<Integer> wealthSum = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
           
        int sum=0;
            for(int j=0; j<arr[i].length; j++){
                sum = sum+arr[i][j];
            }
            wealthSum.add(sum);
        }
        int maxWealth= wealthSum.get(0);
        for(int elements:wealthSum){
            if(maxWealth < elements)
            {
                maxWealth=elements;
            }
        }

        System.out.println(maxWealth);
    }
}
