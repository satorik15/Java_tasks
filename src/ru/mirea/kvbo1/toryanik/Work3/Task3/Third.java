package ru.mirea.kvbo1.toryanik.Work3.Task3;
import java.util.Random;
public class Third
{
    public static void main(String[] args)
    {
        int[] massive= new int[4];
        for (int i=0; i<massive.length;i++)
        {
            Random rand=new Random();
            int rand_int1 = rand.nextInt(90)+10;
            massive[i]=rand_int1;
            System.out.print(massive[i] + " ");
        }
        String result = "Прогрессия возрастающая";
        for (int i = 0; i < massive.length; i++) {
            if (i > 0) {
                if (massive[i - 1] >= massive[i]) {
                    result = "Прогрессия не возрастающая";
                    break;

                }
            }
        }
        System.out.print(result);

    }
}
