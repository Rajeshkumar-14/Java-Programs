import java.util.*;
class Revenue
{
    public void TotalAmount(String name,int month)
    {
        int rent=10000;
        System.out.println(name+" "+"No of month:"+month+" "+"Amount fetched from the tenent:"+ month*rent);
    }
}
class tenent extends Revenue
{
    String name; int month;
    tenent(String name,int month)
    {
        this.name=name;
        this.month=month;
    }
    public void tenentdetails()
    {
      System.out.println(name);
      if(month==0)
      {
        System.out.println("Enter the valid tenent name");
      }
      else
      {
        System.out.println(month);
      }
    }
}
class ApplicationOOPS extends tenent 
{
    ApplicationOOPS(String name,int month)
    {
        super(name,month);
    }

   public static void main(String args[])
   {
    Scanner s = new Scanner (System.in);
    String name=s.next();
    s.close();
    int month=0;
    if(name.equals("tharun"))
    {
        month=4;
    }else if(name.equals("Doffz"))
    {
        month=18;
    }
    ApplicationOOPS obj = new ApplicationOOPS(name,month);
    obj.tenentdetails();
    obj.TotalAmount(name,month);
   } 
}