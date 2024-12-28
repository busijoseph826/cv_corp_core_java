/*1. create a java application where we need to satisfy constructor overloading, main method overloading, overriding by using 2 classes.
*/
class A {
    A(int a) {
        System.out.println(a);
    }

    A(double d) {
        this(8); // Calls the constructor A(int a)
        System.out.println(d);
    }

    static void main(String str) {
        new A(238.87); // Calls the constructor A(double d)
        System.out.println(str);
    }

    static void main(float ft) {
        System.out.println(ft);
    }
}

class B extends A {
    // Constructor of B must explicitly call a constructor of A
    B() {
        super(10); // Calls A(int a)
        System.out.println("B's constructor");
    }

    static void main(String str) {
        System.out.println("Deepak");
    }

    static void main(float ft) {
        System.out.println(ft);
    }

    public static void main(String[] args) {
        A.main("sundeep"); // Calls A's static main(String)
        A.main(34.34f);    // Calls A's static main(float)

        B.main("joseph");  // Calls B's static main(String)
        B.main(876.7f);    // Calls B's static main(float)
    }
}
