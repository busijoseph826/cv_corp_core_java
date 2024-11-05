
//      -------------------------------------------------------------------------21-10-2024----------------------------------------------------------------------------------

/*Consructors :
1.It is a specially defined method .
2.To create our own objects for respective class .
3.To provide user defined values non static or instance variables while creating object.
	A obj=new [A()]----->constructor
	
Rules to create a constructor:
	1.constructor name must be same as class name.
	 class B{
		B(){
		
		}
	}-----
	2.we should not mention return type or non return type.
	3.we cam=n overload a constructorbut not override.
	4.constructor will be invoked automatically when we create a object.
		B obj=new B()-----calling of constructor
	5. we dont use static ,final,abstract,synchronize etc before constructor.

Types of constructors:
	1.Default constructors
	2.parameterized constructor
	3.object parameterized (or)copy constructor
	
Default constructor:
  Syntax:
--------------> 
	class <class name>{
		<classname>(){
					S.O.P()
		}
	}
	1.This constructor does not contains any parameters .
	2.For each and every class compiler will create a default constructor

 */

/* 1. create a java application where we have one class which contains default constructor when we invoke this constructor under main method it has to display 
any user friendly message
*/
class Sample{
	Sample(){
		System.out.print("Hello i'm a constructor");
	}
	public static void main(String [] args)
	{
		Sample obj = new Sample();
	}
}



/*
2.Parameterized constructor:
	1.This constructor will contain parameter and we can resuse those parameters according to our requirements
  Syntax:
		class <class_name>{
				<class_name>(parameters){
							//block of statements;
				}
		}
*/

/* 2. create a java application where we have one class which contains single parameterized constructor having param like String then invoke this constructor under main method by providing dynamic inputs
*/
import java.util.Scanner;
class Sample{
	Sample(String str){
		System.out.print(str);
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Sample obj = new Sample(sc.next());
	}
}

/* 3. create a java application where we have one class which contains single parameterized constructor having param like String , default constructor , double params constructor and triple params constructors  then invoke this constructor under main method by providing dynamic inputs
*/

import java.util.Scanner;
class Sample{
	Sample(){
		System.out.println("Default constructor");
	}

	Sample(String str){
		System.out.print(str);
	}
	Sample(String str, int n){
		System.out.println(str +" "+ n);
	}
	Sample(String str, int n, float ft){
		System.out.print(str+" "+ n+" "+ ft);
	}



	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Sample obj1 = new Sample();
		Sample obj2 = new Sample(sc.next());
		Sample obj3 = new Sample(sc.next(),sc.nextInt());
		Sample obj4 = new Sample(sc.next(),sc.nextInt(),sc.nextFloat());
		
	}
}


//      -------------------------------------------------------------------------22-10-2024----------------------------------------------------------------------------------


/* 4. create a java application where we have one class which contains default constructor single parameterized constructor double parameterized constructor then invoke default under single parameterized constrictor single under double parameterized constructor double under main method by providing dynamically */  
                                                                                                     
import java.util.Scanner;
class Sample{
	static Scanner sc = new Scanner(System.in);

	Sample(){
		System.out.println("Default constructor");
	}

	Sample(String str){
		Sample obj1 = new Sample();
		System.out.print(str);
	}
	Sample(String str, int n){
		Sample obj2 = new Sample(sc.next());
		System.out.println(str +" "+ n);
	}

	public static void main(String [] args)
	{
		Sample obj3 = new Sample(sc.next(),sc.nextInt());
		
	}
}

/* 5. create a java application where we have one class which contains two instance variables without values provide user definied values for this instance varibles by uisng double parameterized constructor then display the updated value then invoke this contructor under main methos by providing dynamic inputs */  
                                                                                                     
import java.util.Scanner;
class Sample{
	static Scanner sc = new Scanner(System.in);
	String str;
	int n;
	Sample(String str1, int n1){
		System.out.println("Intial values: "+ str+ " "+n);
		System.out.println("updated values");
		System.out.print(str1+" "+ n1);
	}
	public static void main(String [] args)
	{	
		new Sample(sc.next(),sc.nextInt());
		
	}
}

/* 6. create a java application where we have one class which contains single parmeterised constructor , non static method with param and return type then these two under main method by providing dynamic inputs  */  

                                                                                                     
import java.util.Scanner;
class Sample{
	static Scanner sc = new Scanner(System.in);
	String m1(int n){
		System.out.println(n);
		return sc.next();
	}
	
	Sample(float ft){
		System.out.println(ft);
	}
	public static void main(String [] args)
	{	
		Sample obj = new Sample(sc.nextFloat());
		System.out.println(obj.m1(sc.nextInt()));		
	}
}

/* 7. create a java application where we have one class which contains two static variables , two non-static variables, static method with params and return type , default constructor , single parameterized constructor ,double param constructor , non-static method with param and return type then invoke all these under main method by providing dynamic inputs */  

                                                                                                     
import java.util.Scanner;
class Sample{
	static Scanner sc = new Scanner(System.in);
	static String str= sc.next();
	static int n=sc.nextInt();
	float ft = sc.nextFloat();
	double d = sc.nextDouble();
	
	static String m1(int n){
		System.out.println("static method");
		System.out.println(n);
		return sc.next();
	}

	Sample(){
		System.out.println("Default constructor");
	}
	
	Sample(char ch){
		System.out.println("Single param constructor");
		System.out.println(ch);
	}
	Sample(boolean b, String str1){
		System.out.println("Double param constructor");
		System.out.println(b+" "+str1);
	}
	
	int m2(String str2){
		System.out.println("non-static method");
		System.out.println(str2);
		return sc.nextInt();
	}
	public static void main(String [] args)
	{	
		System.out.print("static variables : "+n+" "+ str);
		System.out.println(m1(sc.nextInt()));
		new Sample();
		new Sample(sc.next().charAt(0));
		Sample obj = new Sample(sc.nextBoolean(),sc.next());
		System.out.println("non-static variables "+obj.ft+" "+obj.d);  
		System.out.println(obj.m2(sc.next()));
		
	}
}


//      -------------------------------------------------------------------------23-10-2024----------------------------------------------------------------------------------

/* 8. create a java application where we have one class which contains two static methods with params and return type and we have parameterized constructor then invoke all these properties under main method in a single statement by providing dynanic inputs

  */  

                                                                                                     
import java.util.Scanner;

class Sample {
    static Scanner sc = new Scanner(System.in);

    static int m1(String str) {
        System.out.println(str);
        return sc.nextInt();
    }

    static String m2(int num) {
        System.out.println(num);
        return sc.next();
    }

    Sample(String str1) {
        System.out.println(str1);
    }

    public static void main(String[] args) {
        Sample obj = new Sample(m2(m1(sc.next())));
    }
}

/* 9. create a java application where we have one class which contains two static methods with params and return type and we have parameterized constructor then invoke all these properties under main method in a single statement by providing dynanic inputs

  */  

                                                                                                     
import java.util.Scanner;

class Sample {
    static Scanner sc = new Scanner(System.in);

    static int m1(String str) {
        System.out.println(str);
        return sc.nextInt();
    }

    static String m2(int num) {
        System.out.println(num);
        return sc.next();
    }

    Sample(int a, String b) {
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        Sample obj = new Sample(m1(sc.next()),m2(sc.nextInt()));
    }
}

//      -------------------------------------------------------------------------24-10-2024----------------------------------------------------------------------------------
// 3.Copy constructor
//A Constructor contains object as a parameter, the main purpose  of this constructor is to copy the content from one constructor into another constructor
	

/* 10. create a java application where we have one class which contains object parameterzed constructor then invoke this constructor under main method.
  */  
                                                                                               
import java.util.Scanner;
class Sample{
	Sample(){
		System.out.println("default constructor");
	}
	Sample(Sample obj){
		//System.out.print("copy constructor");
	}
	public static void main(String [] args){
		Sample obj = new Sample(new Sample());
	}
}



/* 11. create a java application where we have one class which contains two instance variables with out values provide user defined values by using double param constructor , we have an object param constructor when we invoke instance variables by using object of object param constructor then we need to get same user defined values which we provide at by using double param constructor then invoke these two constructors under main method by providing dynamic inputs
  */  
                                                                                                     
import java.util.Scanner;
class Sample{
	static Scanner sc = new Scanner(System.in);
	int a;
	int b;
	Sample(int c, int d){
		this.a = c;
		this.b = d;
	}
	Sample(Sample obj){
		System.out.print(obj.a+" "+obj.b);
	}
	public static void main(String [] args){
		new Sample(new Sample(sc.nextInt(),sc.nextInt()));
	}
}

/*this key word
this keyword:
 1.It is a predefined keyword also known as current class object.
 2.Whenever we have both instance variable and local variable both are same during execution point of time JVM will get ambiguity to differtiate those variables at this point of time JVM will gives default priority for local variables & if we want to give priority to access instance variables we can use this keyword or by creating manual object for respective class
 3.we can use this keyword at three levels

  -->At Variable level
  -->Method level
  -->Constructor level */


/* 1.Create a java application where we need to satisy this keyword at variable.*/

import java.util.Scanner;

class Sample{
	static Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	void m1(float a){
		System.out.print(this.a);
	}
	public static void main(String[] args){
		new Sample().m1(sc.nextFloat());
	}
}

/* 2.Create a java application where we have one class which contains non-static method void m1(float),non-static method long m1(String),non-static method boolean m1(double) then invoke 1st m1 under 2nd m2, 2nd m1 under 3rd m1 nad 3rd m1 under main method by providing dynamic inputs by using this keyword*/

import java.util.Scanner;

class Sample{
	static Scanner sc = new Scanner(System.in);
	void m1(float a){
		System.out.println(a);
	}
	
	long m1(String str){
		this.m1(sc.nextFloat());
		System.out.println(str);
		return sc.nextLong();
	}
	double m1(boolean d){
		System.out.println(this.m1(sc.next()));
		System.out.println(d);
		return sc.nextDouble();
	}
	

	public static void main(String[] args){
		System.out.println(new Sample().m1(sc.nextBoolean()));
	}
}

/* 3.Create a java application where we have one class which contains Sample(), Sample(param), Sample(param,pram),Sample(param,pram,param) then invoke default under single, single udner double, double under triple , triple under main by providing dymanic inputs and by using this keyword.*/

import java.util.Scanner;

class Sample{
	static Scanner sc = new Scanner(System.in);
	Sample(){
		System.out.println("Default constructor");
	}
	Sample(int a){
		this();
		System.out.println(a);
	}
	Sample(int a, int b){
		this(sc.nextInt());
		System.out.println(a+" "+b);
	}
	Sample(int a, int b,int c){
		this(sc.nextInt(),sc.nextInt());
		System.out.println(a+" "+b+" "+c);	
	}
	public static void main(String[] args){
		new Sample(sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
}



//      -------------------------------------------------------------------------04-11-2024----------------------------------------------------------------------------------

// 1.create a java application where we need to satisfied this at all level


import java.util.Scaneer;
class Sample10
{
  static Scanner sc=new Scanner(System.in);
  Sample10()
  {
	System.out.println("Default");
  }
  Sample10(int a)
  {
	this();
	System.out.println(a);
  }
  Sample10( double a, long b)
  {
	this(sc.nextInt());
	System.out.println(a+ " "+b);
  }
  Sample10(int a,float b,boolean c)
  {
	this(sc.nextDouble(),sc.nextLong());
	System.out.println(a+ " "+b+" "+c);
   }
public static void main(String[] args)
{
	new Sample10(sc.nextInt(),sc.nextFloat(),sc.nextBoolean());
}
} 

   //   -------------------------------------------------------------------------05-11-2024----------------------------------------------------------------------------------

/* 1. create a java application we satify "this" keyword at varible level, method level, constructor level*/

import java.util.Scanner;
class Sample{
	static Scanner sc = new Scanner(System.in);
	float a = sc.nextInt();
	void m1(int a){
		System.out.println(a);
		System.out.println(this.a);
	}
	boolean m1(String a){
		System.out.println(a);
		this.m1(sc.nextInt());
		return sc.nextBoolean();
	}
	Sample(String a){
		System.out.println(a);
		System.out.println(this.m1(sc.next()));
	}
	Sample(double a){
		this(sc.next());
		System.out.println(a);
	}
	public static void main(String[]args){
		new Sample(sc.nextDouble());
	}
}
