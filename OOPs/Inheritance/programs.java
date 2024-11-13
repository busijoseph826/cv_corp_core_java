
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
//Multilevel Inheritance Example
//When there is a chain of inheritance, it is known as multilevel inheritance. As you can see in the example given below, BabyDog class inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance.

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

/* 3. create a java application where we have one class like cvcorp which contains properties like id, name,branch,batch of students then provide four student details then display invidual student details by using methods then invoke all the methods under main method by providing dynamic inputs.  */

import java.util.Scanner;

class CvCorp{
	static Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
	String name = sc.next();
	String branch = sc.next();
	int batch =sc.nextInt();
}
class Student1 extends CvCorp{
	void display(){
		System.out.println("Student1");
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("branch: "+branch);
		System.out.println("batch: "+batch);
	}

}
class Student2 extends CvCorp{
	void display(){
		System.out.println("Student2");
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("branch: "+branch);
		System.out.println("batch: "+batch);
	}

}
class Student3 extends CvCorp{
	void display(){
		System.out.println("Student3");
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("branch: "+branch);
		System.out.println("batch: "+batch);
	}

}
class Student4 extends CvCorp{
	void display(){
		System.out.println("Student4");
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("branch: "+branch);
		System.out.println("batch: "+batch);
	}

}
public class Students{
	public static void main(String[]args){
		new Student1().display();
		new Student2().display();
		new Student3().display();
		new Student4().display();
	}
}


//------------------------------------------------------------Hierarchical Inheritance Example-----------------------------------------------


//When two or more classes inherits a single class, it is known as hierarchical inheritance. In the example given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.

class A {
    public void displayA() {
        System.out.println("Class A: Base class");
    }
}

class B extends A {
    public void displayB() {
        System.out.println("Class B: Derived from A (Single-level Inheritance)");
    }
}

class C extends A {
    public void displayC() {
        System.out.println("Class C: Another derived class from A (Hierarchical Inheritance)");
    }
}

class D extends B {
    public void displayD() {
        System.out.println("Class D: Derived from B (Multi-level Inheritance)");
    }
}

class E extends C {
    public void displayE() {
        System.out.println("Class E: Derived from C (Hierarchical with Single-level)");
    }
}
class F extends C {
    public void displayE() {
        System.out.println("Class E: Derived from C (Hierarchical with double-level)");
    }
}


public class HybridInheritance {
    public static void main(String[] args) {
        D objD = new D();
        objD.displayA(); // From class A
        objD.displayB(); // From class B
        objD.displayD(); // From class D

        System.out.println();

        E objE = new E();
        objE.displayA(); // From class A
        objE.displayC(); // From class C
        objE.displayE(); // From class E
    }
}

//--------------------------------------------Super Keyword----------------------------------------------------------
/*1.create a java application where we need to sasify super keyword at variable level by providing dynamic inputs*/

import java.util.Scanner;
class A{
	static Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
}
class B extends A{
	float a = sc.nextFloat();
	void m1(){
		System.out.println(a);
		System.out.println(super.a);
	}
	public static void main(String[]args){
		new B().m1();
	}
}



/* 2.create a java application where we have one class which contains non-static method m1(String) and returns integer value then inherit this class into another class which contains again method m1() with same param and return type then inherit this class into another class which contains again method m1 having same param and return type then invoke 1st m1 method under 2nd m1 method and 2nd m1 method under 3rd  m1 method , 3rd m1 under main method by using super keyword andproviding dynamin inputs */

import java.util.Scanner;
class A{
	static Scanner sc = new Scanner(System.in);
	int m1(String str){
		System.out.println(str);
		return sc.nextInt();
	}
}
class B extends A{
	int m1(String str){
		System.out.println(str);
		System.out.println(super.m1(sc.next()));
		return sc.nextInt();
	}
}
class C extends B{
	int m1(String str){
		System.out.println(str);
		System.out.println(super.m1(sc.next()));
		return sc.nextInt();
	}
	public static void main(String[]args){
		System.out.println(new C().m1(sc.next()));
	}

}

/* 3.create a java application where we have one class which containd default constructor then inherit this class into another class which contains parametrized constructor then inheri this class into another class whc=ich contains double param constructor then inherit this class into another class which contains another class which containd default constructor then inherit this class into another class which conatins triple parma constructor then invoke constructor with in a constructor by using super keyword and last constircupr under main method by providing dynamic inputs*/


import java.util.Scanner;

// Base class with default constructor
class ClassA {
    public ClassA() {
        System.out.println("ClassA: Default Constructor");
    }
}

// ClassB inherits ClassA and has a parameterized constructor
class ClassB extends ClassA {
    public ClassB(String param) {
        super();  // Invoking ClassA's default constructor
        System.out.println("ClassB: Parameterized Constructor with param = " + param);
    }
}

// ClassC inherits ClassB and has a double-parameter constructor
class ClassC extends ClassB {
    public ClassC(String param1, int param2) {
        super(param1);  // Invoking ClassB's parameterized constructor
        System.out.println("ClassC: Double-Parameter Constructor with param1 = " + param1 + ", param2 = " + param2);
    }
}

// ClassD inherits ClassC and has a default constructor
class ClassD extends ClassC {
    public ClassD() {
        super("Default", 0);  // Invoking ClassC's double-parameter constructor
        System.out.println("ClassD: Default Constructor");
    }
}

// ClassE inherits ClassD and has a triple-parameter constructor
class ClassE extends ClassD {
    public ClassE(String param1, int param2, double param3) {
        super();  // Invoking ClassD's default constructor
        System.out.println("ClassE: Triple-Parameter Constructor with param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3);
    }
}

public class ConstructorChainingExample {
    public static void main(String[] args) {
        // Taking dynamic inputs
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string parameter: ");
        String param1 = scanner.nextLine();
        
        System.out.print("Enter an integer parameter: ");
        int param2 = scanner.nextInt();
        
        System.out.print("Enter a double parameter: ");
        double param3 = scanner.nextDouble();
        
        // Creating an instance of ClassE, which will invoke all constructors in the hierarchy
        System.out.println("\nCreating an instance of ClassE:");
        new ClassE(param1, param2, param3);
        
        scanner.close();
    }
}

//---------------------------------------------------------12-11-2024-------------------------------------------------------------------

/* 1.create a java application where we need to statisfy super keyword at all three levels.*/	

import java.util.Scanner;
class A{
	static Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	A(){
		System.out.println("A");
	}
	String m1(boolean b){
		System.out.println(b);
		return sc.next();
	}
}
class B extends A{
	int a = sc.nextInt();
	B(String str){
		super();
		System.out.println(str);
	}
	String m1(boolean b){
		System.out.println(a+" derived class");
		System.out.println(super.a+" base class");
		System.out.println("base class"+super.m1(sc.nextBoolean()));
		return sc.next();
	}
	public static void main(String[]args){
		B obj = new B(sc.next());
		System.out.println(obj.m1(sc.nextBoolean()));
	}
}

/*1.create a java application where we need to satisfy this and super keyword at all three levels.*/

import java.util.Scanner;
class A{
	static Scanner sc = new Scanner(System.in);
	float ft = sc.nextFloat();
	
	A(float ft){
		System.out.println(ft);
		System.out.println(this.ft);
	}
	A(String str, int n){
		this(sc.nextFloat());
		System.out.println(str+" "+n);
	}
	double m1(long num){
		System.out.println(num);
		return sc.nextDouble();
	}
}
class B extends A{
	float ft = sc.nextFloat();
	B(){
		super(sc.next(),sc.nextInt());
		System.out.println("B");
	}
	double m1(long num){
		System.out.println(super.m1(sc.nextLong()));
		System.out.println("A "+super.ft);
		System.out.println("B "+ft);
		System.out.println(num);
		return sc.nextDouble();
	}
	public static void main(String[]args){
		B obj = new B();
		System.out.println(obj.m1(sc.nextLong()));
	}
}


//------------------------------------------------------------------13-11-2024-----------------------------------------------------
/*1.create a java application where we have one class which contains  non-static methods like m1,m2 and m3 with params and return type. We have another class which contains 3 non-static methods m4,m5and m6 having param and return type. Then invoke m1 under m4, m3 under m5 then m4,m5 under main method by providing dynamic inputs.*/

import java.util.Scanner;

class A {
    static Scanner sc = new Scanner(System.in); 

    int m1(String str) {
        System.out.println(str);
        return sc.nextInt();
    }

    boolean m2(int n) {
        System.out.println(n);
        return sc.nextBoolean();
    }

    long m3(char ch) {
        System.out.println(ch);
        return sc.nextLong();
    }
}

class B {
    String m4(int n) {
        System.out.println(n);
        A obj = new A();
        System.out.println(obj.m1(A.sc.next()));
        return A.sc.next();
    }

    float m5(boolean b) {
        System.out.println(b);
        A obj = new A();
        System.out.println(obj.m3(A.sc.next().charAt(0)));
        return A.sc.nextFloat();
    }

    char m6(double db) {
        System.out.println(db);
        return A.sc.next().charAt(0);
    }

    public static void main(String[] args) {
        B obj = new B();

        System.out.println(obj.m4(A.sc.nextInt()));
        System.out.println(obj.m5(A.sc.nextBoolean()));
    }
}

