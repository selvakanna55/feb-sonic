package Sortings;


class QuickSorting {
    static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void printArray(int arr[]) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }


    static int partition(int arr[], int left, int right) {
        int pivot = arr[left];
        int i = left, j = right;
        while (i < j) {
            while (i < right && arr[i] <= pivot) i++;
            while (j >= left && arr[j] > pivot) j--;
            if (i < j) swap(arr, i, j);
        }
        swap(arr, left, j);
        return j;
    }


    static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static void main(String args[]) {
        System.out.println("Begin");
        int arr[] = {7, 2, -1, -6, 8, 5, 3, 4};
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
        System.out.println("End");
    }
}