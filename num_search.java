import java.util.*;

class num_search 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter Array Size : ");
        int n=sc.nextInt();

        int[] a = new int[10];
        int[] b= new int[10];
 
        int i,j,found=0;

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("AFTER ROTATION :");

        int rotate = 3;
        for (i = 0; i < n; i++)
        {
            b[(i + rotate+1) % n] = a[i];
        }

        for(i=0;i<n;i++)
        {
            System.out.println(b[i]+" ");
        }

        System.out.print("ENter Target Value : ");
        int target_value=sc.nextInt();

        for(i=0;i<n;i++)
        {
            if(a[i]==target_value)
            {
                found++;
                break;
            }
        }

        if(found!=0)
        {
            System.out.println(i);
        }
        else
        {
            System.out.println("-1");
        }
    }
    
}
