abstract class A {
    abstract void play(String str);
    void eat(String str) {
        System.out.println(str + " eats ramen");
    }
}

interface I {
    default void eat1(String str) {
        System.out.println(str + " eats Biryani");
    }
    void play1(String str);
}

public class Ex5 {
    public static void main(String[] args) {
        A obj1 = new A() {
            void play(String str) {
                System.out.println(str + " plays cricket");
            }
        };
        I obj2 = new I() {
            public void play1(String str) {
                System.out.println(str + " plays Tennis");
            }
        };
        obj1.play("Joseph");
        obj1.eat("Joseph");
        obj2.play1("Sattar");
        obj2.eat1("Sattar");
    }
}
