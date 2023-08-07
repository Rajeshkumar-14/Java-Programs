import java.util.*;

class op_str_cmp 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine(),b=sc.nextLine(),c=a+a;
        System.out.println(c.contains(b));
    }
}
