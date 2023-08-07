package Inheritance;

class a {
    void print() {
        System.out.println("Class A");
    }
}

class b extends a {

    void show() {
        System.out.println("Class B");
    }

}

public class multi_level extends b {

    public static void main(String args[]) {

        multi_level ml = new multi_level();

        ml.print();
        ml.show();

    }

}
