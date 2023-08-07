import java.util.*;

class Array_list_demo 
{
    public static void main(String args[])
    {
        ArrayList<Integer> demo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter No of elements to be Added : ");
        int n=sc.nextInt();

        for(i=0;i<n;i++)
        {
            int k=sc.nextInt();
            demo.add(k);
        }
        System.out.println("YOUR LIST : ");
        System.out.println("Array List"+demo);

        System.out.println("Enter Index Position :");
        int a=sc.nextInt();
        System.out.println("Enter the Element : ");
        int b=sc.nextInt();

        demo.set(a,b);
        System.out.println("Array List 1 "+demo);

        ArrayList<Integer> demo1 = new ArrayList<>();

        demo1.addAll(demo);

        System.out.println("Array List 2 "+demo1);

        demo.sort(Comparator.naturalOrder());
        System.out.println("Sorted :"+demo);

    }
    
}
