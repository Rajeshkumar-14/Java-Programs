import java.util.*;

public class Combine_2ArrayList {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of ArrayList 1 : ");

        int n=sc.nextInt();

        ArrayList<String> str = new ArrayList<>();
        String temp="";
        System.out.println("Enter Elements of ArrayList 1 : ");

        for(int i=0;i<n;i++)
        {
            temp=sc.next();
            str.add(temp);
            temp="";
        }

        ArrayList<String> str1 = new ArrayList<>();
        
        System.out.print("Enter Size of ArrayList 2 : ");

        int n2=sc.nextInt();
        System.out.println("Enter Elements of ArrayList 2 : ");

        for(int i=0;i<n;i++)
        {
            temp=sc.next();
            str1.add(temp);
            temp="";
        }

        ArrayList<String> cmb = new ArrayList<>();

        cmb.addAll(str);
        cmb.addAll(str1);

        System.out.println("After Combining Two Arrays : ");

        for(String a:cmb)
        {
            System.out.print("["+a+" "+"]");
        }
    }
    
}
