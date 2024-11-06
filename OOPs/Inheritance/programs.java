
//------------------------------------------------05-11-2024---------------------------------------------------------------------------
//-------------------------------------------------Single Level Inheritance ---------------------------------------------------------------
/* 1. create a java application where we have one class which contains non-static mthod m1() having param and return type, we have anther class which contains static method m2() having param and return type then invoke m1,m2 under main method by providing dynamic inputs*/

import java.util.Scanner;

class Sample{
	static Scanner sc = new Scanner(System.in);
	int m1(String s){
		System.out.println("m1() method");
		System.out.println(s);
		return sc.nextInt();
	}
}
class Sample1 extends Sample{
	static int m2(String s){
		System.out.println("m2() method");
		System.out.println(s);
		return sc.nextInt();
	}
	public static void main(String[]args){
		System.out.println(new Sample1().m1(sc.next()));
		System.out.println(m2(sc.next()));
	}
}
/*2.create a java application where we have software company it will provide employee details like emp_id, emp_desigantin, salary, location to one employee then employee has to access these prperties and need to print these values with respcet to one method then invoke that method under main method by providing dynamic inputs.*/

import java.util.Scanner;
class Employee{
	static Scanner sc = new Scanner(System.in);
	int emp_id = sc.nextInt();
	String designation  = sc.next();
	double salary = sc.nextDouble();
	String location = sc.next();
	void display(){
		System.out.println("Emp id : "+emp_id);
		System.out.println("Emp Designation : "+designation);
		System.out.println("Emp Salary : "+salary);
		System.out.println("Emp Location : "+location);
	}
}
class Employee1 extends Employee{
	public static void main(String[]args){
		new Employee1().display();
	}
}

/*2.create a java application where we have software company it will provide employee details like emp_id, emp_desigantin, salary, location to one employee then employee has to access these prperties and need to print these values with respcet to one method then invoke that method under main method by providing dynamic inputs.*/

import java.util.Scanner;
class Software{
	static Scanner sc = new Scanner(System.in);
	static int emp_id = sc.nextInt();
	static String designation  = sc.next();
	static double salary = sc.nextDouble();
	static String location = sc.next();
}
class Employee extends Software{
	void display(){
		System.out.println("Emp id : "+emp_id);
		System.out.println("Emp Designation : "+designation);
		System.out.println("Emp Salary : "+salary);
		System.out.println("Emp Location : "+location);
	}

	public static void main(String[]args){
		new Employee().display();
	}
}


//-------------------------------------------06-11-2024-------------------------------------------------------------------------

//-------------------------------------------Multi-level Inheritance----------------------------------------------------------------


/*1.create a java application where we have one class which contains static variable and non-static variable and one non-static method with param and return type then inherit this class into another class , which contains two static varibles and one static method with param and return type then inherit this class into another class which contains two non-static varibles and one static varible non-static method with param and return type then inherit this class into another class which contains non-static and static varible static method with param and return type then access all these properties under main main method by providing dynamic inputs */

import java.util.Scanner;

class A{
	static Scanner sc = new Scanner(System.in);
	static int a1 = sc.nextInt();
	int a2 = sc.nextInt();
	String aa1(int a){
		System.out.println(" IN class A");
		System.out.println(a);
		return sc.next();
	}
}
class B extends A{
	static int b1 = sc.nextInt();
	static int b2 = sc.nextInt();
	Double bb1(int b){
		System.out.println(" IN class B");
		System.out.println(b);
		return sc.nextDouble();
	}
}
class C extends B{
	static int c1 = sc.nextInt();
	static int c2 = sc.nextInt();
	int c3 = sc.nextInt();
	Boolean cc1(int c){
		System.out.println(" IN class C");
		System.out.println(c);
		return sc.nextBoolean();
	}

}
class D extends C{
	static int d1 = sc.nextInt();
	int d2 = sc.nextInt();
	static float dd1(int d){
		System.out.println(" IN class D");
		System.out.println(d);
		return sc.nextFloat();
	}
	public static void main(String[]args){
		D obj = new D();
		System.out.println("A");
		System.out.println(a1+" "+obj.a2);
		System.out.print(obj.aa1(sc.nextInt()));

		System.out.println("B");
		System.out.println(b1+" "+b2);
		System.out.print(obj.bb1(sc.nextInt()));

		System.out.println("C");
		System.out.println(c1+" "+c2+" "+obj.c3);
		System.out.print(obj.cc1(sc.nextInt()));

		System.out.println("D");
		System.out.println(d1+" "+obj.d2);
		System.out.print(dd1(sc.nextInt()));
		
	}

}

/* 2. create a java application where we have one mobile manufacturing company,they will design mobiles with specific brand name,its specifications are like ram,rom,battery and price then they will release this mobile into wholesale market then they will increase the price of the mobile from there it will release into retail market again price has to increase then this mobile will be purchased by the customer then customer has to display all these values with respect to one method then invoke this method under main method by providing dynamic inputs.*/

import java.util.Scanner;

class Mobile{
	static Scanner sc = new Scanner(System.in);
	static String brand = sc.next();
	static int ram = sc.nextInt();
	static int rom = sc.nextInt();
	static float price = sc.nextFloat();
}
class Wholesale extends Mobile{
	static float inc1 = sc.nextFloat();
	static float price1=inc1+price;
}
class Retail extends Wholesale{
	static float inc2 = sc.nextFloat();
	static float price2=inc2+price1;
}
class Customer extends Retail{
	static float inc3 = sc.nextFloat();
	static float price3=inc3+price2;
	static void display(){
		System.out.println(brand+" "+ram+" "+" "+rom+" Intial Price "+price);
		System.out.println("Price in wholesale "+price1);
		System.out.println("Price in ratail "+price2);
		System.out.println("Price of customer "+price3);
	}
	public static void main(String[]args){
		display();
	}
}

