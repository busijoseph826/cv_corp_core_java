package p3;

import p1.*;
import p1.p2.*;

public class B extends A implements I1, I2 {
    public B() {
        super("sattar");
    }

    @Override
    public void play1(String str) {
        System.out.println(str + " plays cricket");
    }

    @Override
    public void play2(String str) {
        System.out.println(str + " plays tennis");
    }

    @Override
    public void play3(String str) {
        System.out.println(str + " plays kabaddi");
    }

    @Override
    public void m2(int a, int b) {
        // Resolving conflict between A.m2 and I2.m2
        System.out.println("Resolved m2 in B: Sum and Product");
        I2.super.m2(a, b); // Calls I2's default method
        super.m2(a, b);    // Calls A's method
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.play1("Joseph");
        obj.play2("Sundeep");
        obj.m1(5, 10);
        obj.m2(3, 4);

        A obj1 = new B(); // Polymorphic reference
        obj1.play3("Deepak");
    }
}
