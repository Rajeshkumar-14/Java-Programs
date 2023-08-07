import java.util.*;

public class colindrome {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int n = str.length();
        boolean flag = true;

        if(n%6==0)
        {

            for(int i=0;i<n;i+=6)
            {
                for(int st=i, end=i+5;st<end;st++,end--)
                {
                    if(str.charAt(st)!=str.charAt(end))
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag==false)
                {
                    break;
                }
            }
        }
        else
        {
            flag=false;
        }
        if(flag)
        {
            System.out.println("Colindrome");
        }
        else
        {
            System.out.println("Not a Colindrome");

        }
    }
    
}
