import java.util.*;

class clock_anti_cock_rotate 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Matrix size : ");
        int n=sc.nextInt();
        int[][] a=new int[n][n],b=new int[n][n],c=new int[n][n],x=new int[n][n];
        int i,j;

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                b[j][i]=a[i][j];
            }
        }

        System.out.println();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        int d=n-1;
        //Clock-Wise
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                c[i][j]=b[i][d-j];
            }
        }
        //Anti-Clock-Wise
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                x[i][j]=b[d-i][j];
            }
        }
        System.out.println("Clockwise : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Anti-Clockwise : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
