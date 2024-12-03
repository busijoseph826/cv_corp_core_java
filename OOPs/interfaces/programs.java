/*Interface in Java
An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

Java Interface also represents the IS-A relationship.
It cannot be instantiated just like the abstract class.
Since Java 8, we can have default and static methods in an interface.
Since Java 9, we can have private methods in an interface.
Why use Java interface?
There are mainly three reasons to use interface. They are given below.

It is used to achieve abstraction.
By interface, we can support the functionality of multiple inheritance.
It can be used to achieve loose coupling.
*/

/*1. Create a java application where we have one interface which contains one defined method and one non-defined method then inherit this class into a concret class invoke the methods under main method by providing dynamic inputs */
import java.util.Scanner;
interface A{
	void play(String str);
	default void m1(String str){
		System.out.println(str);
	}
}
class B implements A{
	public void play(String str){
		System.out.println(str+" play cricket");
	}
	public static void main(String[]args){
		B obj = new B();
		obj.m1("joe");
		obj.play("joseph");
	}
}

/*2. Create a java application where we have one interface which contains one defined method and non-defined method, one abstract class which contains one parameterized constructor one defined method one non-defined method. then inherit these interface and abstarct class into a concret class and invoke the methods under mai method by providing dynamic inputs */
import java.util.Scanner;
interface A{
	void play(String str);
	default void m1(String str){
		System.out.println(str);
	}
}
abstract class B{
	void eat(String str){
		System.out.println(str+" loves ramen");
	}
	abstract void run(String str);
	B(String str){
		System.out.println(str);
	}
	
}
class C extends B implements A{
	C(){
		super("joseph");
	}
	public void play(String str){
		System.out.println(str+" play cricket");
	}
	void  run(String str){
		System.out.println(str+" can run");
	}
	public static void main(String[]args){
		Scanner sc  = new Scanner(System.in);
		C obj1 = new C();
		obj1.play(sc.next());
		obj1.run(sc.next());
		obj1.eat(sc.next());
		obj1.m1(sc.next());	
	}
}
