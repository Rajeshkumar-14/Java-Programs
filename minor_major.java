import java.util.*;

class minor_major
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Age : \n");
		int age=sc.nextInt();
		int x;
		
		if(age<=18)
		{
			x=1;
		}
		else
		{
			x=2;
		}
		
		switch(x)
		{
			case 1:
			{
					System.out.println("You are MINOR");
				break;
			}
			case 2:
			{
					System.out.println("You are MAJOR");
				break;
			}
		}
	}
}
		