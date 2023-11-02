import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class PedrickAssignment9 {
    public static void main(String[] args){
        Random rand  = new Random();
        long startTime;
        long endTime;
        long executionTime;

        //BubbleArray
        int[] bubbleArray = new int[50000];
        for (int i=0; i<50000; i++){
            bubbleArray[i] = rand.nextInt();
        }
        startTime = System.nanoTime();
        bubbleSort(bubbleArray);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Time for BubbleSort(ms): " + (executionTime * 0.000001));


        //InsertionSort
        int[] insertionArray = new int[50000];
        for (int i=0; i<50000; i++){
            insertionArray[i] = rand.nextInt();
        }
        startTime = System.nanoTime();
        insertionSort(insertionArray);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Time for InsertionSort(ms): " + (executionTime * 0.000001));


        //MergeSort
        int[] mergeArray = new int[50000];
        for (int i=0; i<50000; i++){
            mergeArray[i] = rand.nextInt();
        }
        startTime = System.nanoTime();
        mergeSort(mergeArray);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Time for MergeSort(ms): " + (executionTime * 0.000001));


        //QuickSort
        int[] quickArray = new int[50000];
        for (int i=0; i<50000; i++){
            quickArray[i] = rand.nextInt();
        }
        startTime = System.nanoTime();
        quickSort(quickArray);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Time for QuickSort(ms): " + (executionTime * 0.000001));
        

        //Collections.sort()
        ArrayList<Integer> collectionsList = new ArrayList<Integer>();
        for (int i=0; i<50000; i++){
            collectionsList.add(rand.nextInt());
        }
        startTime = System.nanoTime();
        Collections.sort(collectionsList);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Time for Collections.sort() (ms): " + (executionTime * 0.000001));

    }

    //BubbleSort
    public static void bubbleSort(int[] bubbleArray){
        //Start of Sorting
        boolean needNextPass = true;
        for (int k=1; k<bubbleArray.length && needNextPass; k++){
            needNextPass = false;
            for (int i=0; i<bubbleArray.length - k; i++){
                if (bubbleArray[i] > bubbleArray[i+1]) {
                    int temp = bubbleArray[i];
                    bubbleArray[i] = bubbleArray[i+1];
                    bubbleArray[i+1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    //InsertionSort
    public static void insertionSort(int[] insertionArray){
        //Start of Sorting
        for (int i=0; i<insertionArray.length; i++){
            int currentElement = insertionArray[i];
            int k;
            for (k=i-1; k>=0 && insertionArray[k] > currentElement; k--){
                insertionArray[k+1] = insertionArray[k];
            }
            insertionArray[k+1] = currentElement;
        }
    }

    //MergeSort
    public static void mergeSort(int[] mergeArray){
        //Start of Sorting
        if (mergeArray.length > 1){
            int[] firstHalf = new int[mergeArray.length / 2];
            System.arraycopy(mergeArray, 0, firstHalf, 0, mergeArray.length / 2);
            mergeSort(firstHalf);

            int secondHalfLength = mergeArray.length - mergeArray.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(mergeArray, mergeArray.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, mergeArray);
        }
    }
    public static void merge(int[] list1, int[] list2, int[] temp){
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length){
            if (list1[current1] < list2[current2]){
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }
        }

        while (current1 < list1.length){
            temp[current3++] = list1[current1++];
        }
        while (current2 < list2.length){
            temp[current3++] = list2[current2++];
        }
    }

    //QuickSort
    public static void quickSort(int[] quickArray){
        quickSort(quickArray, 0, quickArray.length - 1);
    }
    private static void quickSort(int[] list, int first, int last){
        if (last > first){
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex -1);
            quickSort(list, pivotIndex + 1, last);
        }
    }
    private static int partition(int[] list, int first, int last){
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low){
            //Search forward from left
            while (low <= high && list[low] <= pivot){
                low++;
            }
            //Search backward from right
            while (low <= high && list[high] > pivot){
                high--;
            }
            //Swap two elements in the list
            if (high > low){
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot){
            high--;
        }
        //Swap pivot with list[high]
        if (pivot > list[high]){
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }
}

/*
 * Declare an array of 50,000 integers
 * Fill it with random ints
 * Calculate the time to sort it
 * Print the time in ms
 */