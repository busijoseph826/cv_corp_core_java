package p1;

public interface I2 {
    default void m2(int a, int b) {
        System.out.println("Sum (I2): " + (a + b));
    }

    void play2(String str);
}
