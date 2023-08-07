class num_box_pattern 
{
    public static void main(String args[])
    {
        int i,j,n=5,k=1;

        for(j=0;j<n;j++)
        {
            for(i=0;i<n;i++)
            {
                if(i==0)
                {
                    System.out.print(k);
                    k++;
                }
                System.out.println();
            }

        }
        for(j=n;j>0;j--)
        {
            for(i=n;i>0;i--)
            {
                if(i==1)
                {
                    System.out.print(k);
                    k++;
                }
                System.out.println();
            }
        }
    }
    
}
