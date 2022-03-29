package Ord;

import java.util.ArrayList;
import java.util.Random;

public class FisherYates<T extends Comparable> {

    public void fisherYates(ArrayList<T> arr)
    {
        Random r = new Random();
        for (int i = 0; i < arr.size(); i++) {
            int j = r.nextInt(i+1);
            // Swap arr[i] with the element at random index
            T temp = arr.get(i);
            arr.set(i,arr.get(j));
            //arr[i] = arr[j];
            arr.set(j,temp);
            //arr[j] = temp;
        }
    }
}
