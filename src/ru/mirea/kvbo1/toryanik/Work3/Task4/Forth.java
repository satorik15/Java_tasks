package ru.mirea.kvbo1.toryanik.Work3.Task4;
import java.util.Scanner;
import java.util.Random;
public class Forth
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Введите размер массива:");
        int n =input.nextInt();
        while (n <= 3) {
            if (n <= 3)
            {
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод:");
            }
            n =input.nextInt();
        }
        int evenNums=0;
        int[] massive = new int[n];
        for (int i=0;i<massive.length;i++)
        {
            int rand_int=rand.nextInt(n+1);
            massive[i]=rand_int;
            System.out.println(massive[i]);
            if(massive[i]%2 == 0){
                evenNums++;
            }


        }
        int [] massive2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(massive[i]%2 == 0){
                massive2[index] = massive[i];
                index++;
            }
        }
        if(evenNums==0)
        {
            System.out.println("Нет четных чисел");
        }
        for (int i=0;i<massive2.length;i++)
        {
            System.out.println(massive2[i]);
        }
    }
}
