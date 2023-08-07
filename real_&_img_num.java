import java.util.*;
class real_img_num
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int a[]=new int [n];
		int b[]=new int [n];

		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}

		int c=a[0]+b[0];
		int d=a[1]+b[1];

		System.out.println(c+"+"+d+"i");

		int e=a[0]-b[0];
		int f=a[1]-b[1];

		System.out.println(e+"+"+f+"i");

		int g=(a[0]*b[1])+(a[1]*b[0]);
        
		System.out.println(g+"+"+g+"i");
	}
}