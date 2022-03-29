package Ord;

import java.util.ArrayList;

public class QuickSort <T extends Comparable>{

    public void quickSort(ArrayList<T> arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSort(arr, left, index - 1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }

    private int partition(ArrayList<T> arr, int left, int right){
        int i = left, j = right;
        T tmp;
        T pivot = arr.get((left + right)/ 2);
        while (i <= j) {
            while (arr.get(i).compareTo(pivot) < 0) {  //arr[i] < pivot
                i++;
            }
            while (arr.get(j).compareTo(pivot) > 0) {  // arr[j] > pivot
                j--;
            }
            if (i <= j) {
                tmp = arr.get(i);     // intercambio de posiciones
                arr.set(i,arr.get(j));  //
                arr.set(j,tmp);    //
                i++;
                j--;
            }
        };
        return i;
    }
}
