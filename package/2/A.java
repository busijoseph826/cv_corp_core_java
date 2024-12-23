package p1.p2;

public abstract class A {
    public void m2(int a, int b) {
        System.out.println("Product (A): " + (a * b));
    }

    public abstract void play3(String str);

    public A(String str) {
        System.out.println("Parameterized constructor called");
        System.out.println("Message: " + str);
    }
}
