import java.util.*;

class numinstring
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int l=a.length();
		int sum=0;
		for(int i=0;i<l;i++)
		{
			int x=0;
			char p=a.charAt(i);
			if(p>47 && p<58)
			{
				x=p-48;
				sum=sum+x;
			}
		}
		System.out.println(sum);
	}
}