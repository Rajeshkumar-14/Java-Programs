package Inheritance;

class A{
    void print()
    {
        System.out.println("Class A");
    }
}
class B extends A{
    void show()
    {
        System.out.println("Class B");
    }
}

class hierarchical extends A{

    public static void main(String args[])
    {
        hierarchical hr = new hierarchical();
        hr.print();

        B br = new B();
        br.show();
        
    }
    
}
