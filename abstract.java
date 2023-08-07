
abstract class candidate 
{
    abstract void run();
}
class abstract_class extends candidate
{
    void run(){System.out.println("HI");}
    public static void main(String args[])
    {
        candidate can = new abstract_class();
        can.run();
    }    
}