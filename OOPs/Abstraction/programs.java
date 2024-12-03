
/*Abstraction in Java is the process in which we only show essential details/functionality to the user. The non-essential implementation details are not displayed to the user. 
1.Java Abstract classes and Java Abstract methods
2.An abstract class is a class that is declared with an abstract keyword.
3.An abstract method is a method that is declared without implementation.
4.An abstract class may or may not have all abstract methods. Some of them can be concrete methods
5.A abstract method must always be redefined in the subclass, thus making overriding compulsory or making the subclass itself abstract.
6.Any class that contains one or more abstract methods must also be declared with an abstract keyword.
7.There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
8.An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.*/

/* 1.Create a java application where we have abstract class which contains one abstract method with param and return type then inherit this class into concrete class provide functionality for abstract method then invoke the method under main method by providing dynamic inputs.*/

import java.util.Scanner;
abstract class Play{
	abstract int play(String str);
}
class Cricket extends Play{
	static Scanner sc = new Scanner(System.in);
	int play(String str){
		System.out.println(str+" playing cricket ");
		return sc.nextInt();
	}
	public static void main(String[]args){
		Cricket obj = new Cricket();
		System.out.print(obj.play(sc.next()));
	}
}

/*2. Create a java application where we one class which contains one defined method with parameter and return type then invoke this method under main method by providing dynamic input*/

import java.util.Scanner;
class Example2{
	static Scanner sc = new Scanner(System.in);
	int m1(String str){
		System.out.println(str);
		return sc.nextInt();
	}
	public static void main(String[]args){
		System.out.print(new Example2().m1(sc.next()));
	}
}

/* 3.create a java application where we have an abstract class which contains single parameterized constructor, two abstract methods with parameter and return type then inherit this class into another abstract class which contains one abstract and defined method with parameter and return type then inherit this class into another class provide functionality for abstract methods and then invoke all the methods under main method by using dynamic inputs */

import java.util.Scanner;
abstract class A{
	//static Scanner sc = new Scanner(System.in);
	A(int a){
		System.out.println("single parameterized constructor "+a);
	}
	abstract int eat(String dish);
	abstract int sleep(int hours);
}
abstract class B extends A{
	B(int a){
		super(a);
	}
	abstract int wakeup(String name);
	
	char m1(float ft){
		System.out.println(ft);
		return 'A';
	}
}
class Example3 extends B{
	static Scanner sc = new Scanner(System.in);
	Example3(int a){
		super(a);
	}
	int eat(String dish){
		System.out.println("I love "+dish);
		return sc.nextInt();
	}
	int sleep(int hours){
		System.out.println("I love sleep for "+hours);
		return sc.nextInt();
	}

	int wakeup(String name){
		System.out.println(name+" wakeup in the morning");
		return sc.nextInt();
	}
	public static void main(String[]args){
		Example3 obj1 = new Example3(sc.nextInt());
		System.out.println(obj1.wakeup(sc.next()));
		System.out.println(obj1.eat(sc.next()));
		System.out.println(obj1.sleep(sc.nextInt()));

	}
}

/* 4.Create a java application where we have one concrete class this contains double parameterized constructor and 1 defined method having parameter and return type then inherit this class into another abstract class which contains triple parameterized constructor two abstract methods one defined method then inherit this class into concrete class provide functionality for abstract method then invoke all the method under main method by providing dynamic inputs*/


import java.util.Scanner;

class A{
	static Scanner sc = new Scanner(System.in);

	A(int a,int b){
		System.out.println(a+" "+b);
	}
	double m1(String str){
		System.out.println(str);
		return sc.nextDouble();
	}
}
abstract class B extends A{
	B(int a,int b,int c){
		super(a,b);
		System.out.println(a+" "+b+" "+c);
	}
	abstract void talk(String str);
	abstract void play(String str);
	void m2(float ft){
		System.out.println(ft);
	}
}
class Example4 extends B{
	Example4(int a,int b,int c){
		super(a,b,c);
	}
	void talk(String str){
		System.out.println(str+" can talk");
	}
	void play(String str){
		System.out.println(str+" can play ");
	}
	public static void main(String[]args){
		Example4 obj1 = new Example4(sc.nextInt(),sc.nextInt(),sc.nextInt());
		obj1.talk(sc.next());
		obj1.play(sc.next());
		obj1.m2(sc.nextFloat());
		System.out.println(obj1.m1(sc.next()));
	}
}

import java.util.Scanner;

abstract class ABS{
	abstract void play(String str);
	abstract void eat(String str);
}
class A extends ABS{
	void play(String str){
		System.out.println(str+" play cricket ");
	}
	void eat(String str){
		System.out.println(str+" eat curd rice ");
	}
}
class B extends ABS{
	void play(String str){
		System.out.println(str+" play Tennis ");
	}
	void eat(String str){
		System.out.println(str+" eat Ramen ");
	}
}
class C extends ABS{
	void play(String str){
		System.out.println(str+" play Football ");
	}
	void eat(String str){
		System.out.println(str+" eat Biryani ");
	}
}

/*5*/
class Example5{
	static Scanner sc = new Scanner(System.in);
	void display(ABS obj){
		int n = sc.nextInt();
		switch (n){
			case 1:
				obj = new A();
				obj.play(sc.next());
				obj.eat(sc.next());
				break;
			case 2:
				obj = new B();
				obj.play(sc.next());
				obj.eat(sc.next());
				break;
			case 3:
				obj = new C();
				obj.play(sc.next());
				obj.eat(sc.next());
				break;

		}
		
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		Example5 obj1 = new Example5();
		obj1.display(ABS p);
		
	}
}

import java.util.Scanner;
abstract class B
{
    static Scanner sc=new Scanner(System.in);
    abstract int m1(float f);
    abstract String m2(boolean b);
}
class B1 extends B
{
    int m1(float f)
    {
	System.out.println(f);
	return sc.nextInt();
    }
    String m2(boolean b)
    {
	System.out.println(b);
 	return sc.next();
    }
}
class B2 extends B
{
    int m1(float f)
    {
	System.out.println(f);
	return sc.nextInt();
    }
    String m2(boolean b)
    {
	System.out.println(b);
 	return sc.next();
    }
}
class B3 extends B
{
    int m1(float f)
    {
	System.out.println(f);
	return sc.nextInt();
    }
    String m2(boolean b)
    {
	System.out.println(b);
 	return sc.next();
    }
}
class B4
{
    static Scanner sc=new Scanner(System.in);
    void display(B obj)
    {
	System.out.println(obj.m1(sc.nextFloat()));
	System.out.println(obj.m2(sc.nextBoolean()));
    }
    public static void main(String[] args)
    {
	B b1=new B1();
	B b2=new B2();
	B b3=new B3();
 	String s=sc.next();
	switch(s)
	{
	    case "B1":  new B4().display(b1);
			break;
	    case "B2":  new B4().display(b2);
			break;
	    case "B3":  new B4().display(b3);
			break;
	}
    }
}

/*OUTPUT:
B1
10.5
10.5
10
10
true
true
James
James
*/

