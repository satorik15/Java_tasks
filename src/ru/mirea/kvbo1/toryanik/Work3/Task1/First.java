package ru.mirea.kvbo1.toryanik.Work3.Task1;
import java.util.*;
public class First
{
    public static void main(String[] args)
    {
        double[] massive = new double[5];
        System.out.println("Unsorted massive created by Class Random");
        for (int i=0;i<massive.length;i++)
        {
            Random rand = new Random();
            double rand_dub1 = rand.nextDouble(100.0);
            massive[i]=rand_dub1;
            System.out.println(massive[i]);
        }
        System.out.println("Sorted massive");
        bubbleSort(massive);
        for (int i=0;i<massive.length;i++)
        {
            System.out.println(massive[i]);
        }
        double[] arr = new double[5];
        System.out.println("Unsorted massive created by method Random");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=Math.random();
            System.out.println(arr[i]);
        }
        bubbleSort(arr);
        System.out.println("Sorted massive");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }



    }
    public static void bubbleSort(double[] massive){
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for(int i = massive.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
            if( massive[j] > massive[j+1] ){
                double tmp = massive[j];
                massive[j] = massive[j+1];
                massive[j+1] = tmp;
            }
        }
    }
}
}
