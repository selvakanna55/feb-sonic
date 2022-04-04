package Sortings;


class MergeTwoSorted {
    static void printArray(int arr[]) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        System.out.println("Begin");
        int arr1[] = {2, 4, 6, 8, 10};
        int arr2[] = {1, 3, 5, 7, 9, 11};
        //merge two sorted array arr1, arr2
        int i = 0, j = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int res[] = new int[n1 + n2];
        int k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) res[k++] = arr1[i++];
            else res[k++] = arr2[j++];
        }
        while (i < n1) res[k++] = arr1[i++];
        while (j < n2) res[k++] = arr2[j++];

        printArray(arr1);
        printArray(arr2);
        printArray(res);
        System.out.println("End");
    }
}