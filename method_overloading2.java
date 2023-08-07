package Polymorphism;

/*------------------- METHOD OVERLOADING ------------------------------ */

class area {

    static double find_area(double a,double b){
        return a*b;
    };

    static int find_area(int a,int b){
        return a*b;
    }
}

public class method_overloading2{
    public static void main(String args[])
    {
        System.out.println(area.find_area(5,5));
        System.out.println(area.find_area(15.5,20.2));

    }
}