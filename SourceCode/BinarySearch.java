package SourceCode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 6, 8, 3 };
        int target = 7;
        int firstIndex = 0;
        int lastIndex = arr.length-1;
        sort(arr);
        int result = search(arr, target,firstIndex, lastIndex);
        for (int elements : arr) {
            System.out.println(elements);
        }
        System.out.println("Element found at index: "+ result);
        System.out.println("Done");
    }

    static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       
      
    }
    static int search(int[] arr, int target, int firstIndex, int lastIndex){
       
      while(firstIndex < lastIndex){
        int middle = (firstIndex + lastIndex) / 2;
        if(arr.length <=0){
            return -1;
        }
        else if(arr[middle] == target){
            return middle;
        }
        else if(arr[middle] > target){
            lastIndex = middle -1;
        }
        else if(arr[middle] < target){
            firstIndex = middle +1;
        }
      }
       return -1;
    }
}
