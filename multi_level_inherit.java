interface printable {
    void print();
}

interface showable extends printable {
    void show();
}

class multi_level_inherit implements showable {
    public void print() {
        System.out.println("HELLO");
    }

    public void show() {
        System.out.println("BYE");
    }

    public static void main(String args[]) {
        multi_level_inherit ml = new multi_level_inherit();
        ml.print();
        ml.show();
    }

}
