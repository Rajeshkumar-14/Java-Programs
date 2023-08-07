import java.util.*;

class alice_friends 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt(),i,j,cnt=0;
        int[] a = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int res=a[0];

        for(i=0;i<n;i++)
        {
            if(res==a[i])
            {
                cnt++;
            }
        }
        if(cnt==n)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(cnt);
        }
    }
    
}
