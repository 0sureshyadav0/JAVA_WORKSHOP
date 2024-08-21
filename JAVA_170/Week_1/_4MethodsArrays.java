package JAVA_170.Week_1;

// Topics: Method definition, method overloading, arrays
// Practice: Write methods to find the maximum and minimum values in a array
// Assignment: Create a program to perform various operations on arrays(e.g sorting,searching)
public class _4MethodsArrays {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 0, 3 };
        int start = 0;
        int end = arr.length -1;

        // int minResult = min(arr);
        // int maxResult = max(arr);
        // System.out.println(minResult);
        // System.out.println(maxResult);
        int target = 8;
        // System.out.println(linearSearch(arr, target));
        // System.out.println("Binary Search: " + binarySearch(arr, target));
        // int[] sortedArray = bubbleSort(arr);
        // Bubble Sort 
        // for (int elements : arr) {
        //     System.out.println(elements);
        // }
        // Selection Sort
        // int[] returnedSelectionSort = selectionSort(arr);
        // for(int elements:returnedSelectionSort){
        // System.out.println(elements);

        // }
        // Insertion Sort
        // System.out.println(insertionSort(arr));


        //Merge Sort
        
      mergeSort(arr,start,end);

    }

    // public static int min(int[] arr) {

    //     int min = arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] < min) {
    //             min = arr[i];
    //         }
    //     }
    //     return min;
    // }

    // public static int max(int[] arr) {
    //     int max = arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] > max) {
    //             max = arr[i];
    //         }
    //     }
    //     return max;
    // }

    // Searching
    // 1. Linear Search
    // 2. Binary Search
    // public static int linearSearch(int[] arr, int target) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == target) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static int binarySearch(int[] arr, int target) {
    //     int[] sortedArray = bubbleSort(arr);
    //     int firstIndex = 0;
    //     int lastIndex = arr.length - 1;
    //     while (firstIndex <= lastIndex) {
    //         int middle = (firstIndex + lastIndex) / 2;
    //         if (sortedArray.length <= 0) {
    //             return -1;
    //         }
    //         if (sortedArray[middle] == target) {
    //             return middle;
    //         } else if (target < sortedArray[middle]) {
    //             lastIndex = middle - 1;
    //         } else if (target > sortedArray[middle]) {
    //             firstIndex = middle + 1;
    //         }

    //     }
    //     return -1;
    // }
    // Sorting
    // 1. Bubble Sort
    // 2. Selection Sort
    // 3. Insertion Sort
    // 4. Merge Sort
    // 5. Quick Sort
    // 6. Heap Sort
    // 7. Counting Sort
    // 8. Radix Sort
    // 9. Bucket Sort
    // 10. Tim Sort
    // 11. Arrays.sort()

    // Bubble Sort
    // public static int[] bubbleSort(int[] arr) {
    //     int temp;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[i] > arr[j]) {
    //                 temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    //     return arr;
    // }
    //selectionSort
    // Time complexity = O(n^2)
    // Space complexity = O(1)
    // public static int[] selectionSort(int[] array){
    //     for(int i=0; i<array.length;i++){
    //     int minIndex = i;
    //       for(int j=i+1;j<array.length;j++){
    //         if(array[j] < array[minIndex])
    //         {
             
    //          minIndex = j;
    //         }
    //       }
    //       int temp = array[i];
    //       array[i] = array[minIndex];
    //       array[minIndex] = temp;
    //     }
        
    //     return array;
    // }

    // insertin sort
    // first part -> sorted array suppose it is arr[0]
    // second part -> unsorted array from index 1 upto n
    // {5,8,2,0,3}
   
    // public static int[] insertionSort(int[] arr){
    //     for(int i = 1; i<arr.length; i++){
    //             int key = arr[i];
    //             int j = i-1;
    //             while(key < arr[j] && j>= 0){
    //                 arr[j+1] = arr[j];
    //                 j--;
    //             }
    //             arr[j+1] = key;
    //     }

    //     return arr;
    // }

    // Merge Sort
    
int array[] = {4,6,2,6,4};
void mergeSort(int arr[], int start, int end){
    int middle = start + (end-start)/2;
    if(start == end){
        return;
    }
    mergeSort(arr, start, middle);
    mergeSort(arr, middle +1, end);
   merge(arr, start, middle, end);
}
int[] merge(int arr[], int start, int mid, int end){
    
        int temp[];
        int index=0;
        while(start <= mid){
            if(arr[start] < arr[mid+1]){
                temp[index] = arr[start];
                index++; start++;
            }
            else{
                temp[index] = arr[mid+1];
                index++; mid++;
            }
        }
        while(start <= mid){
            temp[index] = arr[start];
            index++; start++;
        }
        while(mid+1 <= end){
            temp[index] = arr[end];
            index++; end++;
        }
        index = 0;
        while(start <= end){
            arr[index] = temp[start];
            start++; index++;
        }
        return arr;
    
}

    // Quick Sort
}
