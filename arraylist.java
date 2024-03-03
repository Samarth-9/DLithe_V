import java.util.*;

public class arraylist {
    public static ArrayList<Integer> leaders(int[] arr, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int maxRight = arr[n - 1];
        result.add(maxRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                result.add(0, maxRight);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        int[] arr2 = {1, 2, 3, 4, 0};

        ArrayList<Integer> result1 = leaders(arr1, arr1.length);
        ArrayList<Integer> result2 = leaders(arr2, arr2.length);

        System.out.println("Leaders in arr1: " + result1);
        System.out.println("Leaders in arr2: " + result2);
    }
}