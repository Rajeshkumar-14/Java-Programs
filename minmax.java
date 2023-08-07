import java.util.*;

class minmax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int i;

        for (i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        int min = 0, max = 0;

        for (i = 0; i < n - 1; i++) 
        {
            min = min + a[i];
        }
        for (i = 1; i < n; i++) 
        {
            max = max + a[i];
        }
        System.out.println(min+" "+max);

    }

}
