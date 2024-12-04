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


/* 3.create a java application where we have 3 interfaces with individual abstract and defined methods , we have one abstract class which contains defined and undefined methods double param constructor then inherit all these at a time into one concrete class provide functionality for abstract methods then invoke all the properties under the main method of the separate class.*/

import java.util.Scanner;
interface I1{
	static Scanner sc = new Scanner(System.in);
	int m1(String str);
	default String m2(int n){
		System.out.println(n);
		return sc.next();
	}
}
interface I2{
	int m3(float ft);
	default int m4(String str){
		System.out.println(str);
		return I1.sc.nextInt();
	}

}
interface I3{
	int m5(char ch);
	default boolean m6(long ln){
		System.out.println(ln);
		return I1.sc.nextBoolean();
	}

}
abstract class A{
	A(int a, int b){
		System.out.println(a+" "+b);
	}
	void play(String str){
		System.out.println(str+" play Tennis");
	}
	abstract void eat(String food);
}
class B extends A implements I1,I2,I3{
	B(){
		super(sc.nextInt(),sc.nextInt());
	}
	public int m1(String str){
		System.out.println(str);
		return sc.nextInt();
	}
	public int m3(float ft){
		System.out.println(ft);
		return sc.nextInt();
	}
	public int m5(char ch){
		System.out.println(ch);
		return sc.nextInt();
	}
	void eat(String food){
		System.out.println("I love "+food);
	}
}
class C{
	public static void main(String args[]){
		B obj = new B();
		System.out.println(obj.m1(I1.sc.next()));
		System.out.println(obj.m3(I1.sc.nextFloat()));
		System.out.println(obj.m5(I1.sc.next().charAt(0)));
		obj.eat(I1.sc.next());
		System.out.println(obj.m2(I1.sc.nextInt()));
		System.out.println(obj.m4(I1.sc.next()));
		System.out.println(obj.m6(I1.sc.nextLong()));
		obj.play(I1.sc.next());
	}

}

/* 4.create a java application where we have one interface which contains one abstract method then inherit this interface into another interface which contains one abstract and defined method, then inherit interface into another interface which contains defined method then inherit this interface into concrete class provide fuctionality for all the abstract method then invoke all the methods under main method by providing dynamic inputs */

import java.util.Scanner;

interface I1{
	void m1(String str);
}
interface I2 extends I1{
	void m2(String str);
	default void m3(String str){
		System.out.println(str);
	}
}
interface I3 extends I2{
	default void m4(String str){
		System.out.println(str);
	}
}
class A implements I3{
	public void m1(String str){
		System.out.println(str);
	}
	public void m2(String str){
		System.out.println(str);
	}
	public void m4(String str){
		System.out.println(str);
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		A obj = new A();
		obj.m1(sc.next());
		obj.m2(sc.next());
		obj.m4(sc.next());
		obj.m3(sc.next());
	}
}

