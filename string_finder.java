import java.util.*;

class string_finder 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your String : ");
        String s=sc.nextLine();

        int len=s.length();

        if(len==0)
        {
            System.out.println("The String is EMPTY ");
        }
        else
        {
            System.out.println("The is NOT EMPTY");
        }
    }
    
}
