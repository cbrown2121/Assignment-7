import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeBubble {
    public static void main(String[] args) {
        List<Integer> data = generateRandomData(1000);

        // Save the original data to a file
        saveDataToFile("original.txt", data);

        long startTime;
        long endTime;

        // Bubble Sort
        List<Integer> bubbleData = new ArrayList<>(data);
        startTime = System.nanoTime();
        bubbleSort(bubbleData);
        endTime = System.nanoTime();
        long bubbleSortTime = endTime - startTime;

        // Merge Sort
        List<Integer> mergeData = new ArrayList<>(data);
        startTime = System.nanoTime();
        mergeSort(mergeData);
        endTime = System.nanoTime();
        long mergeSortTime = endTime - startTime;

        // Save sorted data to files
        saveDataToFile("bubble.txt", bubbleData);
        saveDataToFile("merge.txt", mergeData);

        System.out.println("Bubble Sort Time: " + bubbleSortTime + " nanoseconds");
        System.out.println("Merge Sort Time: " + mergeSortTime + " nanoseconds");
    }

    public static List<Integer> bubbleSort(List<Integer> arr) {
        // Bubble Sort implementation (same as previous code)
        // ...
        return arr;
    }

    public static List<Integer> mergeSort(List<Integer> arr) {
        // Merge Sort implementation (same as previous code)
        // ...
        return arr;
    }

    public static List<Integer> generateRandomData(int size) {
        List<Integer> data = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            data.add(random.nextInt(1000)); // Generates random integers between 0 and 999
        }

        return data;
    }

    public static void saveDataToFile(String fileName, List<Integer> data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Integer value : data) {
                writer.write(value.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
