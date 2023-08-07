import java.util.*;

class num_triangle 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pyramid size : ");

        int n=sc.nextInt();

        int i,j,s,l;

        for (i=1;i<=n;i++)
        {
            for (s=n;s>i;s--)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for (l=i-1;l>=1;l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
        
    }
}
