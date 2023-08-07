import java.util.*;
public class parking_lot
{
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int a[][]= new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               a[i][j]=s.nextInt();
            }
        }
        int cnt=0,max=0,pos=0;
        for(int i=0;i<row;i++)
        {
            cnt=0;
            for(int j=0;j<col;j++)
            {
                if(a[i][j]==1)
                {
                    cnt++;
                }
            }
            if(max<cnt)
            {
                max=cnt;
                pos=i+1;
            }
        }
        System.out.println(pos);
    }
}