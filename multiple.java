package Inheritance;

interface A{

    void print();
}
interface B{

    void show();
}


public class multiple implements A,B {

    public void print()
    {
        System.out.println("Interface A");
    }

    public void show()
    {
        System.out.println("Interface B");
    }


    public static void main(String args[])
    {
        multiple ml = new multiple();

        ml.print();
        ml.show();
    }
    
}
