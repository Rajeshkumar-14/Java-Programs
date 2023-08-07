import java.util.*;

class array_max 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int t=sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
    

        int i,j;

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        while(t!=0)
        {
            int x=(sc.nextInt())-1;
            int y=(sc.nextInt())-1;

            for(i=0;i<n;i++)
            {
                b[i]=a[i];
            }

            for(i=x;i<=y;i++)
            {
                b[i]=0;
            }
            //swap
            for(i=0;i<n;i++)
            {
                for(j=i+1;j<n;j++)
                {
                    if(b[i]>b[j])
                    {
                        int temp=b[i];
                        b[i]=b[j];
                        b[j]=temp;
                    }
                }
            }
            System.out.println(b[n-1]);
            t--;
        }
    }
    
}
