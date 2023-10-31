import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class PedrickAssignment8 {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>(100000);
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime;
        long endTime;
        long executionTime;

        Random rand = new Random();
        for (int i=0; i<100000; i++){
            int randomInt = rand.nextInt();
            arrayList.add(randomInt);
        }
        for (int i=0; i<100000; i++){
            int randomInt = rand.nextInt();
            linkedList.add(randomInt);
        }

        //ArrayList get()
        startTime = System.nanoTime();
        for (int i=0; i<1000; i++){
            arrayList.get(rand.nextInt(100000));
        }
        endTime = System.nanoTime();
        executionTime = (endTime - startTime);
        System.out.println("Time for get() in ArrayList(ms): " + (executionTime * 0.000001));
        //LinkedList get()
        startTime = System.nanoTime();
        for (int i=0; i<1000; i++){
            linkedList.get(rand.nextInt(100000));
        }
        endTime = System.nanoTime();
        executionTime = (endTime - startTime);
        System.out.println("Time for get() in LinkedList(ms): " + (executionTime * 0.000001));


        //ArrayList add()
        startTime = System.nanoTime();
        for (int i=0; i<1000; i++){
            arrayList.add(0, rand.nextInt(1000));
        }
        endTime = System.nanoTime();
        executionTime = (endTime - startTime);
        System.out.println("Time for insertion in ArrayList(ms): " + (executionTime * 0.000001));
        //LinkedList add()
        startTime = System.nanoTime();
        for (int i=0; i<1000; i++){
            linkedList.add(0, rand.nextInt(1000));
        }
        endTime = System.nanoTime();
        executionTime = (endTime - startTime);
        System.out.println("Time for insertion in LinkedList(ms): " + (executionTime * 0.000001));


        //ArrayList remove()
        startTime = System.nanoTime();
        for (int i=0; i<1000; i++){
            arrayList.remove(rand.nextInt(100000));
        }
        endTime = System.nanoTime();
        executionTime = (endTime - startTime);
        System.out.println("Time for deletion in ArrayList(ms): " + (executionTime * 0.000001));
        //LinkedList remove()
        startTime = System.nanoTime();
        for (int i=0; i<1000; i++){
            linkedList.remove(rand.nextInt(100000));
        }
        endTime = System.nanoTime();
        executionTime = (endTime - startTime);
        System.out.println("Time for deletion in LinkedList(ms): " + (executionTime * 0.000001));

    }
}


/*
 * Create a LinkedList and ArrayList of ints with 100,000 random ints
 * Measure and print the time to:
 * get 1,000 numbers at random positions from both
 * insert 1,000 numbers in the beginning of both
 * remove 1,000 numbers at random positions from both
 * 
 * Print the time in milliseconds (1/1000 seconds)
 * 
 * Random rand = new Random();
 * randomInt = rand.nextInt(0, MAXINT);
 * System.nanoTime() to get the timer
 * nano = 1/1000000000 seconds
 * 
 * long startTime = System.nanoTime();
 * //Code
 * long endTime = System.nanoTime();
 * long executionTime = (endTime - startTime);
 * //convert to milliseconds
 * 
 * Print:
 * "Time for get() in List: "
 * "Time for insertion in List: "
 * "Time for deletion in List: "
 */