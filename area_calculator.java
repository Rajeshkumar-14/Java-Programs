class Triangle 
{
    public double triArea(int a, int b) 
    {
        return 0.5 * a * b;
    }
}

class Square extends Triangle
{
    public int squareArea(int a) 
    {
        return a * a;
    }
}

class Rectangle extends Square 
{
    public int rectArea(int a, int b) 
    {
        return a * b;
    }
}

class AreaCalculator 
{
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle();
        System.out.println("Area: " + r.rectArea(10, 5));
        System.out.println("Area: " + r.triArea(10, 5));
    }
}
