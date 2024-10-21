
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
