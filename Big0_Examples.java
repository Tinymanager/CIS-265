import java.util.*;

public class Big0_Examples {
    public static void main(String[] args) {


    }
    //O(1) - constant time
    public int accessElement(int[] arr, int index){
        return arr[index];
    }

    //O(long n) - logarithimic time (binary search)
    public int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = left * (right - left) / 2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    //O(n) - Linear Time
    public int findMax(int[] arr){
        int maxVal = arr[0];
        for (int num : arr){
            if (num > maxVal){
                maxVal = num;
            }
        }
        return maxVal;
    }

    //O(n^2) - Quadratic Time (finding pairs with Sum)
    public List<int[]> findPairsWithSum(int[] arr, int targetSum){
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == targetSum){
                    pairs.add(new int[] {arr[i], arr[j]});
                }
            }
        }
        return pairs;
    }

    //O(n log(n)) - Linearithmic Time (MergeSort)
    public void mergeSort(int[] arr){
        if (arr.length > 1){
            int mid = arr.length / 2;
            int[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
            int[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(leftHalf);
            mergeSort(rightHalf);

            int i = 0, j = 0, k = 0;
            while (i < leftHalf.length && j < rightHalf.length){
                if (leftHalf[i] < rightHalf[j]){
                    arr[k] = leftHalf[i];
                    i++;
                } else {
                    arr[k] = rightHalf[j];
                    j++;
                }
                k++;
            }

            while (i < leftHalf.length){
                arr[k] = leftHalf[i];
                i++;
                k++;
            }

            while (j < rightHalf.length){
                arr[k] = rightHalf[j];
                j++;
                k++;
            }
        }
    }

    //O(2^n) - Exponential Time
    public static int calculateFibonacci(int n){
        if (n <= 1){
            return n;
        } else {
            return calculateFibonacci(n-1) + calculateFibonacci(n-2);
        }
    }
}
