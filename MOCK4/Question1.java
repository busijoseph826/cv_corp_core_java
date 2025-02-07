/*

Batch 187-190

1. Create a Java Application with abstract class "A" having 1 undefined method "m1" with parameter and return type and 1 defined method "m2" with parameter and return type, one Interface "I1" with 1 undefined method "m3" with parameter and return type and 1 static method "m4" with parameter and return type. Invoke all these methods under Main method of Class "Test".

Note: Implement the undefined methods without using "extends" and "implements" keywords involving "lambda expression" (providing Dynamic inputs).

*/

import java.util.Scanner;

// Abstract class A

abstract class A {
    static Scanner sc = new Scanner(System.in);

    // Abstract method m1

    abstract int m1(String name);

    // Concrete method m2

    int m2(String name) {
        System.out.println(name);
        return sc.nextInt();
    }
}

// Interface I1

interface I1 {
    int m3(String name);

    // Static method m4

    static int m4(String name) {
        System.out.println(name);
        Scanner sc = new Scanner(System.in); // Create a new Scanner instance
        return sc.nextInt();
    }
}

// Main class

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lambda expression implementing m3 of I1

        I1 obj = (name) -> {
            System.out.println(name);
            return sc.nextInt();
        };

        System.out.println("Enter a name for m3:");
        System.out.println(obj.m3(sc.next())); // Using m3 as it's the abstract method in I1

        // Anonymous class implementation of abstract class A

        A obj1 = new A() {
            @Override
            int m1(String name) {
                System.out.println("Overridden m1: " + name);
                return sc.nextInt();
            }
        };

        System.out.println("Enter a name for m1:");
        System.out.println(obj1.m1(sc.next()));

        System.out.println("Enter a name for m2:");
        System.out.println(obj1.m2(sc.next()));

        // Calling static method m4 from I1

        System.out.println("Enter a name for m4:");
        System.out.println(I1.m4(sc.next()));
    }
}
