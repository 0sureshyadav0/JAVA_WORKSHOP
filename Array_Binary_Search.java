class Array_Binary_Search {

    int BinarySearch(int[] arr, int left, int right, int searchingValue) {

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == searchingValue) {
                return middle;
            } else if (arr[middle] > searchingValue) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 15, 30 };
        int targetedValue = 2;
        Array_Binary_Search search = new Array_Binary_Search();
        int returnedValue = search.BinarySearch(arr, 0, arr.length - 1, targetedValue);
        if (returnedValue == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + returnedValue);
        }
    }

}