import java.util.*;

class stone_paper_sissor 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter No of round : ");

        int round=sc.nextInt();

        while(round!=0)
        {
            char[] a=new char[2];
            
            int i;

            System.out.print("Enter Data : ");
            
            for(i=0;i<2;i++)
            {
                a[i]=sc.next().charAt(0);
            }

            int rck=1,pap=2,sis=3,win=6;
            int sum=0;

            if(a[0]=='A' || a[0]=='a')
            {
                a[1]='B';
                sum=sum+(win+pap);
            }
            else if(a[0]=='B' || a[0]=='b')
            {
                a[1]='C';
                sum=sum+(win+sis);
            }
            else if(a[0]=='C' || a[0]=='c')
            {
                a[1]='A';
                sum=sum+(win+rck);
            }
            System.out.println(sum);
            round--;
        }
        sc.close();
    }
    
}
