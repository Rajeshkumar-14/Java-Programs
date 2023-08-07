import java.util.*;

class calories_count 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int elves=1;
        int[] cal=new int[10];
        int i,j,k=0;

        while(elves!=0)
        {
            System.out.print("Enter Inventory Size : ");
            int n=sc.nextInt();

            int[] a=new int[n];
            int sum=0;

            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sum+=a[i];
            }

            cal[k]=sum;
            k++;

            System.out.print("Is There a ELf ? YES( 1 ) , NO( 0 )");
            elves=sc.nextInt();
        }
        int len=cal.length;
        for(i=1;i<=len;i++)
        {
            
        }
        int max=cal[0];
        int pos=0;

        for(j=0;j<len;j++)
        {
            for(i=0;i<len;i++)
            {
                if(cal[i]>max)
                {
                    max=cal[i];
                    pos=i+1;
                }
            }
        }
        System.out.println(max+" "+pos);
    }
    
}
