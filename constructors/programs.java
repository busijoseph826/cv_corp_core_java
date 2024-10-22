
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
