import java.util.*;

public class Permutations {

    public static void main(String[] args) {

        char[] str = "ABC".toCharArray();
        int[] nums = {1, 2, 3};

        System.out.println("String Permutations:");
        permute(str, 0);

        System.out.println("\nInteger Permutations:");
        permute(nums, 0);
    }

    // String
    static void permute(char[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1);
            swap(arr, index, i);
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Integer Array
    static void permute(int[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1);
            swap(arr, index, i);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}