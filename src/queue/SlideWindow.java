package queue;

public class SlideWindow {
    void brute(int arr[], int k) {
        int ans = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 4, 7, 9, 3, 11, 4};
        int k = 3;
        int maxiSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= k) {
                sum -= arr[i - k];
            }
            if (i >= (k - 1)) {
                if (maxiSum < sum) {
                    maxiSum = sum;
                }
            }
        }

        System.out.println(maxiSum);
    }
}
