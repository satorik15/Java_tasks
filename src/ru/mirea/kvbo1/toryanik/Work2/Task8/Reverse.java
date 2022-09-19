package ru.mirea.kvbo1.toryanik.Work2.Task8;

public class Reverse
{
    public static void main(String[] args) {
        String[] massive = new String[5];
        massive[0] = "ball";
        massive[1] = "mouse";
        massive[2] = "crucial";
        massive[3] = "confident";
        massive[4] = "abstractive";
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }
        int n = massive.length;
        String change;
        for (int i = 0; i < n / 2; i++) {
            change = massive[n - i - 1];
            massive[n - i - 1] = massive[i];
            massive[i] = change;
        }
            //Выводим конечный массив в консоль
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }
    }
}
