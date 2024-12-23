/* 2. Create a java application where we need to create a user-defined package which contains 2 interfaces with one abstract and defined method we have one sub-package which contains one abstract class which contains one abstract and defined methods and parameterized constructor then inherit all these properties into separate class of separate package ,main package properties by fully qualified name approach , sub-package properties by using import statement  */

package p1;

public interface I1 {
    default void m1(int a, int b) {
        System.out.println("Sum (I1): " + (a + b));
    }

    void play1(String str);
}

