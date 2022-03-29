package Ord;

import java.util.ArrayList;

public class MergeSort <T extends Comparable>{

    public ArrayList<T> mergeSort(ArrayList<T> A){
        if (A.size() <= 1){
            return A;
        }
        else {
            ArrayList<T> left = new ArrayList<>();
            ArrayList<T> right = new ArrayList<>();

                int i;
                if (A.size() % 2 == 0) {
                    for (i = 0; i < A.size()/2; ++i) {
                        left.add(i, A.get(i));
                    }
                } else {

                    for ( i = 0; i < A.size()/2+1; ++i) {
                         left.add(i, A.get(i));
                    }
                }
                int k = 0;
                for (int j = i; j < A.size(); ++j) {
                    right.add(k,A.get(j));
                    ++k;
                }
                ArrayList<T> ord = Merge(mergeSort(left), mergeSort(right));

                return ord;
            }
    }

    public ArrayList<T> Merge(ArrayList<T> a, ArrayList<T> b){
        int i = 0;
        int j = 0;
        int value = a.size() + b.size();
        ArrayList<T> ordP = new ArrayList<>();

        for(int k = 0; k < value;++k){
            if (a.get(i).compareTo(b.get(j)) < 0){
                ordP.add(k,a.get(i));
                //ordP[k] = a[i];
                ++i;
            }else {
                ordP.add(k,b.get(j));
                //ordP[k] = b[j];
                ++j;
            }
            if (i == a.size()){
                ++k;
                for (j = j; j < b.size();j++){
                    ordP.add(k,b.get(j));
                    //ordP[k] = b[j];
                    ++k;
                }
            }
            else if(j == b.size()){
                ++k;
                for (i = i; i< a.size(); i++){
                    ordP.add(k,a.get(i));
                    //ordP[k] = a[i];
                    ++k;
                }
            }

        }

        return ordP;
    }
}
