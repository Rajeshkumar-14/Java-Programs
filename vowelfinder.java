import java.util.*;


class vowelfinder 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String s=sc.nextLine();

        int len=s.length();

        int i,count=0;

        for(i=0;i<len;i++)
        {
            if(s.charAt(i)=='E' || s.charAt(i)=='e')
            {
                count++;
            }
        }
        System.out.print(count);
    }
    
}
