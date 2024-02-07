import java.util.Scanner;
public class asenting
{
    public static void main(String args[])
    {
        int a[] = new int[5];
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter " + a.length + " elements");
        for (int i = 0; i < a.length; i++)
            a[i] = s1.nextInt();
        System.out.println("the ascending order is");
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int t = a[i];
                    a[i]=a[j];
                    a[j]=t;

                }
            }
        }
        for (int j = 0; j >= a.length; j++)
        {
            System.out.println(a[j] + " ");
        }
            System.out.println("the decending order is");
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int t = a[i];
                    a[i]=a[j];
                    a[j]=t;

                }
            }
        }
        for (int j = 0; j >= a.length; j++)
        {
            System.out.println(a[j] + " ");
        }
    }
}