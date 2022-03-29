package Ord;

import java.util.ArrayList;

public class CycleSort <T extends Comparable>{

    public void cycleSort(ArrayList<T> array)
    {
        for (int currentIndex = 0; currentIndex < array.size() - 1; currentIndex++)
        {

            T   item = array.get(currentIndex);
            int currentIndexCopy = currentIndex;

            for (int i = currentIndex + 1; i < array.size(); i++)
                if (array.get(i).compareTo(item) < 0)
                    currentIndexCopy++;

            if (currentIndexCopy == currentIndex)
                continue;

            while (item == array.get(currentIndexCopy))
                currentIndexCopy++;

            T temp = array.get(currentIndexCopy);
            array.set(currentIndexCopy,item);
            item = temp;

            while (currentIndexCopy != currentIndex)
            {
                currentIndexCopy = currentIndex;

                for (int i = currentIndex + 1; i < array.size(); i++)
                    if (array.get(i).compareTo(item) < 0)
                        currentIndexCopy++;


                while (item == array.get(currentIndexCopy))
                    currentIndexCopy++;


                temp = array.get(currentIndexCopy);
                array.set(currentIndexCopy,  item);
                item = temp;
            }
        }
    }
}
