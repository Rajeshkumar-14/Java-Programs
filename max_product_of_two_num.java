import java.util.*;

class max_product_of_two_num 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int[] a = new int[n];

        int i,j;

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        //sorting

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int max1=a[n-2],max2=a[n-1];

        int prod=max1*max2,sum=(max1+max2)-1;

        int answer=prod-sum;

        System.out.println(answer);
    }
    
}
