import java.util.*;

/*class employee
{

    public static void emp() {

        Scanner sc = new Scanner(System.in);

        String a[] = {"Service Manager","Supervisor","Employee","Merchandiser","Clerk"};

        System.out.println("Enter Employee ID : ");
        int emp_id = sc.nextInt();

        System.out.println("Enter Employee Workdays : ");
        int days=sc.nextInt();
    }

}*/

class salary
{
    int salary = 30000;

    int calculate(int a)
    {
        if(a==30)
        {
            return salary;
        }
        else if(a>15 && a<30)
        {
            (salary/2);
        }
        else if(a<15)
        {
            (salary-20000);
        }
        else if(a<5)
        {
            (salary-25000);
        }
        return salary; 
    }

}
class payroll {

    public static void main(String args[]) 
    {
        salary sal = new calculate
        
        System.out.println(cal(12));
    }

}
