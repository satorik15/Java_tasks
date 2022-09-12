package Java.FirstWork.Task01;

public class First
{
    public static void main(String[] args)
    {
        int[] array= {1,34,21,54,23,12};
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        double average=(double) sum/array.length;
        System.out.println("Sum of massive="+sum);
        System.out.println("Average of massive="+average);

    }
}
