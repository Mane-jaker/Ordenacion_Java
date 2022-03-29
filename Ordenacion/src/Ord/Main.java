package Ord;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner s =new Scanner(System.in);
        System.out.printf("ingrese los datos a utilizar: ");
        int datos = s.nextInt();
        ArrayList<Dato> cont  = new ArrayList<>();

        for (int i = 0; i<datos; i++){
            char randomizedCharacter = (char) (random.nextInt(26) + 'a');
            char randomizedChar = (char) (random.nextInt(26) + 'a');
            int randomn = random.nextInt(1+datos)+1;
            cont.add(new Dato(randomn,""+randomizedCharacter+randomizedChar));
        }

        System.out.println(cont.toString());

        QuickSort<Dato> soyomelochino = new QuickSort<>();
        soyomelochino.quickSort(cont,0, cont.size()-1);
        System.out.println(cont.toString());


        /*MergeSort<Dato> soychanonachino = new MergeSort<>();
        ArrayList<Dato> dios = new ArrayList<>(soychanonachino.mergeSort(cont));
        System.out.println(dios.toString());
        */

        /*CycleSort<Dato> soyconejochino =new CycleSort<>();
        soyconejochino.cycleSort(cont);
        System.out.println(cont.toString());
        */

        /*FisherYates<Dato> soymanechina = new FisherYates<>();
        soymanechina.fisherYates(cont);
        System.out.println(cont);*/

    }
}
