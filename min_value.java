import java.util.*;

class min_value 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row Count : ");
        int m=sc.nextInt();
        System.out.print("Enter Colum count : ");
        int n=sc.nextInt();
        int a[][]= new int[m][n];

        int i,j;
        System.out.println("Enter Array Values : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        int min=a[0][0];

        for(j=0;j<n;j++)
        {
            for(i=0;i<m;i++)
            {
                if(a[i][j]<min)
                {
                    min=a[j][i];
                }
            }
        }
        System.out.println("The MINIMUM VALUE in the 2D Array is "+min);
    }
}
