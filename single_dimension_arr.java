import java.util.*;

class single_dimension_arr 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int[] a=new int[n],b=new int[n],c=new int[n],m=new int[n];

        int i,j;

        System.out.println("Enter Array 1 elements :");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter Array 2 elements :");
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }

        int midpoint=5/2;
        int k=0;
        for(i=0;i<n;i++)
        {
            
            if(i==midpoint)
            {
               c[k++]=a[i]*b[i];
               

            }
            else
            {
                c[k++]=a[i]*b[i+1];
                c[k++]=a[i+1]*b[i];
                i++;
               
            }
        }
        for(i=0;i<k;i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println();
        for(i=0;i<k;i++)
        {
            if(c[i]>9)
            {
                System.out.print("D ");
            }
            else
            {
                System.out.print("S ");
            }
        }
        System.out.println();
        //modulos

        for(i=0;i<n;i++)
        {
            m[i]=b[i]%a[i];
        }

        for(i=0;i<n;i++)
        {
            System.out.print(m[i]+" ");
        }
        System.out.println();
        for(i=0;i<n;i++)
        {
            if(m[i]==0)
            {
                System.out.print("N ");
            }
            else if(m[i]%2==0)
            {
                System.out.print("E ");
            }
            else if(m[i]%2==1)
            {
                System.out.print("O ");
            }
        }

    }
    
}
