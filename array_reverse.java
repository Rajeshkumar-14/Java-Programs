import java.util.*;

class array_reverse 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size :");
        int n=sc.nextInt();

        int[] a=new int[10];
        int i;

        System.out.println("ENTER ARRAY ELEMENTS :");

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("REVERSED ARRAY IS :");

        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
