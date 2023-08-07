import java.util.*;

class zero_one_pattern 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n=sc.nextInt();
        int i,j;

        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        
    }
}
