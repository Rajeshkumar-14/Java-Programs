import java.util.*;

class rotation_finder 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];

        int i;

        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

		int min = arr[0], min_index = 0;
		for (i = 0; i < n; i++)
         {
			if (min > arr[i]) 
            {
				min = arr[i];
				min_index = i;
			}
		}
        System.out.print("The array is rotated "+min_index+" times");
	}
}

