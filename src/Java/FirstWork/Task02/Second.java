package Java.FirstWork.Task02;
import java.util.Scanner;

public class Second
{
    public static void main(String[] args)
    {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i =0; i<array.length;i++)
        {
            array[i]=input.nextInt();
        }
        int i=0;
        int min=100000;
        int max=0;
        int sum=0;
        while (i<10)
        {
            if(min>array[i])
            {
                min=array[i];
            }
            if(max<array[i])
            {
                max=array[i];
            }
            sum+=array[i];
            i++;
        }
        System.out.println("Maximum number="+max);
        System.out.println("Minimal number="+min);
        System.out.println("Total sum of massive="+sum);
    }

}
