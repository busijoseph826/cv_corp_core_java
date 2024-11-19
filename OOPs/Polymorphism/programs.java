/*Polymorphism in Java
Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.
There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.*/

/* 1. Create a java Application where we need to satisfy overloading 3 methods within a single class */
import java.util.Scanner;
class MethodOverloading{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m1(String str){
		System.out.println(str);
	}
	void m1(int a, String str){
		System.out.println(a+" "+str);
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		MethodOverloading obj = new MethodOverloading();
		obj.m1(sc.nextInt());
		obj.m1(sc.next());
		obj.m1(sc.nextInt(),sc.next());
	}
}

/* 2.Create a java application where we need to satisfy constructor overloading and method overloading.*/
import java.util.Scanner;
class ConstructionOverloading{

	ConstructionOverloading(String str){
		System.out.println(str);
	}
	ConstructionOverloading(int n){
		System.out.println(n);
	}
	static void m1(int a)
	{
		System.out.println(a);
	}
	static void m1(String str){
		System.out.println(str);
	}
	static void m1(int a, String str){
		System.out.println(a+" "+str);
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		new ConstructionOverloading(sc.nextInt());
		new ConstructionOverloading(sc.next());
		m1(sc.nextInt());
		m1(sc.next());
		m1(sc.nextInt(),sc.next());	
	}
}

