import java.util.*;

class string_compare
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        String a=sc.nextLine();
        String b=sc.nextLine();
        int len1=a.length();
        int len2=b.length(),i,j;
        int count=0;

        for(i=0;i<len1;i++)
        {
            char x=a.charAt(i);
            for(j=0;j<len2;j++)
            {
                char y=b.charAt(j);
                if(x!=y)
                {
                    break;
                }
                else
                {
                    count++;
                    
                }
            }
        }
        if(count==len1)
        {
            System.out.println("EQUAL");
        }
        else
        {
            System.out.println("NOT EQUAL");
        }


        
    }
    
}
