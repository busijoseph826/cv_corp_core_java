/* 1. Create a java Application where we have one class it contains two non-static variables, two static variables and one local variables and display all these variables using a non-static display method having no parameters and return type invoke this method under main method.*/

import java.util.Scanner;
class Sample1{

	static Scanner sc = new Scanner(System.in);
	String m1(int num){
		System.out.println(num);
		return sc.next();
	}
	static int m2(double d){
		System.out.println(d);
		return sc.nextInt();
	}
	public static void main(String[] args){
		System.out.println(m2(sc.nextDouble()));
		Sample1 obj = new Sample1();
		System.out.println(obj.m1(sc.nextInt()));
	}
}

/* 2. Create a java application where we have one class it contains one non static method m1 having parameter as string and it is going to return int and a static method m2 having paramter as int ans it is going to return Boolean and we have another static method m3 having boolean as parameter and it is going to return string invoke all these methods under main method in a single line.*/

import java.util.Scanner;
class Sample2{
	static Scanner sc = new Scanner(System.in);
	static Sample2 obj = new Sample2();
	void m1(){
		System.out.println(" m1 method");
	}
	static void m2(float ft){
		System.out.println(ft);
		obj.m1();
	}
	String m3(){
		System.out.println(" m3 method");
		m2(sc.nextFloat());
		return sc.next();
	}
	static boolean m4(int n){
		System.out.println(n);
		System.out.println(obj.m3());
		return sc.nextBoolean();
	}
	public static void main(String[] args){
		System.out.println(m4(sc.nextInt()));
	}
}


/* 3. create a java application where we have one class it contains a static method m1 having parameter as int and it is going to return string and we have another static method m2 having parameter as string and it is going to return int value we have a double parameterized constructor having parameters as m1 and m2 methods returnn values we have a object parametrerized constructor. invoke all of them under main mehtod in a single line calling*/

import java.util.Scanner;

class Sample3{
	static Scanner sc = new Scanner(System.in);
	Sample3(){
		System.out.println("Default Constructor");
	}
	Sample3(int num){
		System.out.println("Single Parameterized Constructor");
		System.out.println(num);
	}
	Sample3(String str, long ln){
		System.out.println("Double Parameterized Constructor");
		System.out.println(str+" "+ln);
	}
	Sample3(float ft, boolean b, char ch){
		System.out.println("Triple Parameterized Constructor");
		System.out.println(ft+" "+b+" "+ch);
	}
	Sample3(Sample3 obj1){
		System.out.println("Object Parameterized Constructor");
	}
	public static void main(String[] args){
		Sample3 obj = new Sample3();
		new Sample3(sc.nextInt());
		new Sample3(sc.next(),sc.nextLong());
		new Sample3(sc.nextFloat(),sc.nextBoolean(),sc.next().charAt(0));
	}
}
	

/* 4.create a java applicatin where we have one non static method m1 having parameter and return type and we have two static method m2,m3 having paramter and return types invoke m1 under m2, m2 under m3 and m3 under  main method. we are allowed to create object only inside method.*/

import java.util.Scanner;
class Sample4{
	static Scanner sc = new Scanner(System.in);

	String str1 = sc.next();
	int num1 = sc.nextInt();
	
	static long l1 = sc.nextLong();
	static boolean b1 = sc.nextBoolean();
	static Sample4 obj = new Sample4();
	int m1(String str){
		System.out.println(str);
		System.out.println("static variables: "+l1+" "+b1);
		System.out.println("non-static variables: "+obj.str1+" "+obj.num1);
		return sc.nextInt();
	}
	static String m2(int n){
		System.out.println(n);
		return sc.next();
	}
	Sample4(){
		System.out.println("Default Constructor");
	}
	Sample4(Sample4 obj2){
		System.out.println("Single Parameterized Constructor");
		
	}
	Sample4(String str, Sample4 obj1){
		System.out.println("Double Parameterized Constructor");
		System.out.println(str);
	}

	public static void main(String[] args){
		System.out.println(new Sample4(m2(sc.nextInt()),new Sample4(new Sample4())).m1(sc.next()));
	}
}
		
	

	
		
