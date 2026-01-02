package sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = (low - 1);

        for(int j = low; j < high; j++){
            System.out.println(Arrays.toString(array));
            if(array[j] <= pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i +1] = array[high];
        return(i + 1);
    }

    static void quickSort(int array[], int low, int high){
        if(low < high){
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        Random ran = new Random();
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = ran.nextInt(20);
        }

        quickSort(array, 0, array.length - 1);
    }
}
