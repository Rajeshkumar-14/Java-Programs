import java.util.Scanner;

class Array_sorting 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int[] a={0,23,14,12,9};
        int len=a.length;

        int i,j;

        for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("{");
        for(i=0;i<len;i++)
        {
            System.out.print(a[i]);
            if(i!=len-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");
        
    }
    
}
