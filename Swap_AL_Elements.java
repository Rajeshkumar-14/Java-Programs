import java.util.*;

public class Swap_AL_Elements{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of ArrayList : ");

        int n=sc.nextInt();

        ArrayList<String> str = new ArrayList<>();
        String temp="";
        System.out.println("Enter Elements of ArrayList : ");

        for(int i=0;i<n;i++)
        {
            temp=sc.next();
            str.add(temp);
            temp="";
        }

        System.out.println("Before Swapping : ");

        for(String a:str)
        {
            System.out.println(a);
        }

        System.out.println("Enter Indexes to Swap (Index 1 , Index 2) : ");

        int ind1=sc.nextInt();
        int ind2=sc.nextInt();

        System.out.println("After Swapping : ");

        Collections.swap(str, ind1, ind2);

        for(String a:str)
        {
            System.out.println(a);
        }





    }
    
}
