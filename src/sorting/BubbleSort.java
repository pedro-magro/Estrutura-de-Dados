package sorting;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = new int[10];
        Random ran = new Random();

        for(int i = 0; i < a.length; i++){
            a[i] = ran.nextInt(100);
        }
        bubbleSort(a);


    }

    static int[] bubbleSort(int []array){

        if(array == null){
            return null;
        }

        for(int i =0; i < array.length - 1; i++){
            System.out.println(Arrays.toString(array));
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j + 1] < array[j]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                }
            }
        }
        return array;
    }
}
