1.create a java application where we have one class by using this class we need to display any user friendly message
    class Sample{
        public static void main(String[]args){
            System.out.println("Hello World");
        }
    }

2.create a java application it contains 2 static variables then acces these variable under main method
    class Sample{
        static int a = 10;
        static String str ="Java";
        public static void main(String[]args){
            System.out.println(a);
            System.out.println(str);
        }
    }

3.create ajava application where we have one class it contains 2 non static variables with values then acces these variables under main method
    class Sample{
        int a = 10;
        str ="Java";
        public static void main(String[]args){
            Sample obj = new Sample();
            System.out.println(obj.a);
            System.out.println(obj.str);
        }
    }

4.create a java application where we have one class it contains 2 static variables & 2 non-static variables & 2 local variables then print all these varibales values under main method
    class Sample{
        static int a2 = 10;
        static char j = 's';
        int a = 10;
        str ="Java";
        public static void main(String[]args){
            Sample obj = new Sample();
            int b2 = 9;
            int b3 = 10;
            System.out.println("non-static variables ");
            System.out.println(obj.a);
            System.out.println(obj.str);

            System.out.println("static variables ");
            System.out.println(a2);
            System.out.println(j);

            System.out.println("local variables ");
            System.out.println(b2);
            System.out.println(b3);
        }
    }

5.create a java application where we have one class it contains 2 static variables & 2 non-static variables without values intialise these 2 variables under main theod then display the values.
    class Sample{
	static int staticVar1;
	static int staticVar2;
    	int nonStaticVar1;
    	int nonStaticVar2;

    	public static void main(String[] args) {
        	
        	staticVar1 = 10;
        	staticVar2 = 20;

        	// Create an instance to initialize non-static variables
        	Sample demo = new Sample();

        	// Initialize non-static variables
        	demo.nonStaticVar1 = 30;
        	demo.nonStaticVar2 = 40;

        	// Display the values
        	System.out.println("Static Variable 1: " + staticVar1);
        	System.out.println("Static Variable 2: " + staticVar2);
        	System.out.println("Non-static Variable 1: " + demo.nonStaticVar1);
        	System.out.println("Non-static Variable 2: " + demo.nonStaticVar2);
	}
}

--------------------------------------day-2 28-09-2024--------------------------------------------------------------------
/* 
6.create a java application where we have one class it contains non static method m1() having no params and returns nothing , when we invoke this method under main method it has to display any user friendly message.

*/

class Sample{
	
    	public static void main(String[] args) {
        	
            	Sample obj = new Sample();
		obj.m1();
		//m2();
		//obj.display("Joseph");

    	}

	void m1(){
		System.out.println("Hello World");
	}

	/*non static methos like m4 having params long and returns true or false 
	boolean m4(long a){
		
	}
	static method like m3 having no params and returns decimal values
	static double m3(){

	}
	
	non static method like display having params string and returns nothing
	void display(String str){
		System.out.println("Hello "+str);
	}

	static void m2(){
		System.out.println("Hello");
	}
	*/

	
}

/* 
7.create a java application where we have one class it contains static method display() having no params, returns nothing when we invoke this method it has to print any user friendly message invoke this in all possible ways

*/

class Sample{

	
	static void display(){
		System.out.println("Hello ");
	}
    	public static void main(String[] args) {
		
		// invoke by directly
        	display();
		
		// invoke by object
		Sample obj = new Sample();
		obj.display();
		
		// invoke by using class
		Sample.display();
            	
    	}
	
}

-------------------------------------------------Day-3 30-09-2024-----------------------------------------------------------

/*
8.create a java application where we have one class it contains non-static method having params String returnnnnns nothing then invoke this methos undeer main method
*/

class Sample {
	
	void nonStatic(String str){
		System.out.println(str+" This is non static method with return nothing");
	}
	public static void main(String[] args){
		Sample obj = new Sample();
		obj.nonStatic("Joseph");
	}
}

/*
9.create a java application where we have one class it contains non-static methods having params like int, string, float, double, boolean returnnnnns nothing then invoke this methos undeer main method
*/
class Sample {
	
	void nonStatic(String str){
		System.out.println(str+" This is non static method with return nothing");
	}

	void nonStatic(int n){
		System.out.println("The Number is "+n);
	}

	void nonStatic(float f){
		System.out.println("The floating point value  is "+f);
	}
	
	void nonStatic(double d){
		System.out.println("The double value is "+d);
	}
	
	void nonStatic(boolean b){
		if(b==true){
			System.out.println("True");
		}
		else{
			System.out.println("Flase");
		}
	}
	
	public static void main(String[] args){
		Sample obj = new Sample();
		obj.nonStatic("Joseph");
		obj.nonStatic(6);
		obj.nonStatic(12.4f);
		obj.nonStatic(223.345668);
		obj.nonStatic(false);
	}
}

/*
10.create a java application where we have one class it contains  static method m1() having params long, returns nothing & non-static method m2() having params float, returns nothing then invoke m1 and m2 under main method */

class Sample {
	
	static void m1(long n){
		System.out.println("The long value is "+n);
	}

	void m2(float f){
		System.out.println("The floating point value  is "+f);
	}
	
	public static void main(String[] args){
		Sample obj = new Sample();
		long n = 12345667098l;
		m1(n);
		obj.m2(8.06f);
	}
}


-------------------------------------------------Day-4 01-10-2024-----------------------------------------------------------

/*
11.Create a java application where we have one class which contains nonstatic methods having params, and returns different data types value then invoke this method under main method
*/

class Sample {

	String m1(float a){
		
		return "Joseph";
	}
	
	int m2(String str){
		return 8;
	}
	
	double m3(int num){
		return 12.3455667;
	}
	
	float m4(char ch){
		return 12.5f;
	}
	
	char m5(int a){
		return 'j';
	}
	
	boolean m6(int b){
		return true;
	}
	
	public static void main(String[] args){
		Sample obj = new Sample();
		System.out.println(obj.m1(12.3f));
		System.out.println(obj.m2("james"));
		System.out.println(obj.m3(8));
		System.out.println(obj.m4('h'));
		System.out.println(obj.m5(12));
		System.out.println(obj.m6(12));
	}
}

/*
12.Create a java application where we have one class which contains static method m1() having params int , return nothing */

import java.util.Scanner;

class Sample {

	
	static void m1(int num){
		System.out.println("The Number is "+num);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		m1(n);
		sc.close();
	}
}


--------------------------------------day-5 02-10-2024--------------------------------------------------------------------

/*
13.Create a java application where we have one class is contains non-static method m1(String) returns nothing , static method m2(long) returns nothing then invoke these two methods into under main method by using dynanic inputs   */

import java.util.Scanner;

class Sample {
    static Scanner sc = new Scanner(System.in);

    void m1(String str) {
        System.out.println("The string is: " + str);
    }

    static void m2(long n) {
        System.out.println("The long value is: " + n);
    }

    public static void main(String[] args) {
        Sample obj = new Sample();
        
        System.out.print("Enter a string: ");
        String str = sc.next(); // Get the string input
        
        System.out.print("Enter a long value: ");
        long n = sc.nextLong(); // Get the long input
        
        obj.m1(str); // Call non-static method
        m2(n); // Call static method
    }
}


--------------------------------------day-6 03-10-2024--------------------------------------------------------------------

/* 14. Create a java application where we have one class it contains a static method m1() having parameters string it is going to return integer value and we have a non static method m2() having parameter as long it going to return float value we have another static method having parameter as int it is going to return nothing invoke all this methods under main method by providing dynamic inputs */

import java.util.Scanner;

class Sample {
    static Scanner sc = new Scanner(System.in);

    // Static method m1() having a string parameter and returning an integer
    static int m1(String str) {
        System.out.println("The string value is: " + str);
        return 10;
    }

    // Non-static method m2() having a long parameter and returning a float
    float m2(long n) {
        System.out.println("Long value is: " + n);
        return 12.4f;
    }

    // Another static method having an int parameter and returning nothing
    static void m3(int n) {
        System.out.println("The integer value is: " + n);
    }

    public static void main(String[] args) {
        Sample obj = new Sample();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a long value: ");
        long l1 = sc.nextLong();
        System.out.println("Return value from m2(): " + obj.m2(l1));

        System.out.print("Enter an integer value: ");
        int n1 = sc.nextInt();
        m3(n1);

        System.out.print("Enter a string value: ");
        sc.nextLine(); // Consume the newline character
        String str = sc.nextLine();
        int result = m1(str);
        System.out.println("Return value from m1(): " + result);

        sc.close();
    }
}


--------------------------------------day-7 04-10-2024--------------------------------------------------------------------

/*1.Create a java application where we have one class it contains two static methods with params and return type then invoke these two methods under main method by providing dynamic inputs */

import java.util.Scanner;

class Sample{
	static Scanner sc = new Scanner(System.in);
	static String m1(int num){
		System.out.println("The Number is "+num);
		String str = sc.next();
		return str;
	}
	static double m2(int num){
		System.out.println("The Number is "+num);
		double d = sc.nextDouble();
		return d;
	}

	public static void main(String args[]){
		System.out.println("Enter number ");
		int num = sc.nextInt();
		Sample obj = new Sample();
		System.out.println(m1(num));
		System.out.println("Enter number ");
		int num1 = sc.nextInt();
		System.out.println(m2(num1));
		
	}
}

/*2.Create a java application where we have one class it contains 3 static variables and 2 non-static varibales and one static method having param and return type then access all these variables under this method then invoke this method under main method by providing dynamic inputs */

import java.util.Scanner;

class Sample{
	static Scanner sc = new Scanner(System.in);
	
	static String str = sc.next();
	static int num = sc.nextInt();
	static double d= sc.nextDouble();
	String s1 = sc.next();
	String s2 = sc.next();

	static String m1(int num1){
		System.out.println(num1);
		System.out.println("Static variables are ");
		System.out.println(str);
		System.out.println(num);
		System.out.println(d);
		Sample obj = new Sample();
		System.out.println("non-static varibales are ");
		System.out.println(obj.s1);
		System.out.println(obj.s2);
		return str;
	}
		
	
	public static void main(String args[]){
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println(m1(n));		
	}
}

--------------------------------------day-8 05-10-2024--------------------------------------------------------------------

/* 1.Create a java application where we have one class it contains non-static method having no params and return nothing , static method m2(float) returns nothing then invoke m1 under m2 , m2 umder main method by provinding dynamic inputs    */

import java.util.Scanner;

class Sample{
	static Scanner sc = new Scanner(System.in);
	void m1(){
		System.out.println("static method M1");
	}
	static void m2(float ft){
		Sample obj = new Sample();
		obj.m1();
		System.out.println("Float value:"+ft);
	}
	public static void main(String args[]){
		float ft = sc.nextFloat();
		m2(ft);
	}
}
/* 2.Create a java application where we have one class it contains static method m1() having no params return nothing , non-static mehtod m2(String) having params String returns nothing ,static method m3() having no params returns double value , non-static method m4(boolean) having params boolean returns short value then invoke m1 under m2, m2 under m3, m3 under m4 , m4 under main method by proving dynamic inputs   */

import java.util.Scanner;

class Sample {
    static Scanner sc = new Scanner(System.in);

    static void m1() {
        System.out.println("Static method m1 called");
    }

    void m2(String str) {
        System.out.println("Non-static method m2 called with parameter: " + str);
        m1(); // Invoking static method m1 from non-static method m2
    }

    static double m3() {
        System.out.println("Static method m3 called - Enter a double value:");
        double d = sc.nextDouble();
        System.out.println("Enter a String value:");
        String str = sc.next();
        Sample obj = new Sample(); // Create an instance for invoking non-static methods
        obj.m2(str); // Invoking non-static method m2 from static method m3
        return d;
    }

    short m4(boolean b) {
        System.out.println("Non-static method m4 called with parameter: " + b);
        System.out.println(m3()); // Invoking static method m3 from non-static method m4
        System.out.println("Enter a short value:");
        short shortValue = sc.nextShort();
        return shortValue;
    }

    public static void main(String[] args) {
        System.out.println("Enter a boolean value:");
        boolean b = sc.nextBoolean();
        Sample obj = new Sample(); // Creating an instance to invoke non-static method m4
        System.out.println("Return value from m4: " + obj.m4(b));
        sc.close(); // Closing scanner to prevent resource leakage
    }
}

--------------------------------------day-9 07-10-2024--------------------------------------------------------------------

/* 1.Create a java application where we have one class it contains non-static method m1() having no params and returns nothing, static method m2() having no params return nothing , non-static method m3(float) having param float returns nothing, static method m4(long) having param long returns nothing, non-static method m5() having no param returns string value, static method m6() having no param returns double value, non static method m7() having params int return char, static method m8() having params boolean return string value , then invoke m1 under m2 and so on.......    */

import java.util.Scanner;

class Sample{
	static Scanner sc = new Scanner(System.in);
	static Sample obj = new Sample();
	void m1(){
		System.out.println("M1() method");
	}
	static void m2(){
		obj.m1();
		System.out.println("M2() method");
	}
	void m3(float f){
		m2();
		System.out.println("M3() method "+f);
	}
	static void m4(long ln){
		System.out.println("m4() in");
		float f = sc.nextFloat();
		obj.m3(f);
		System.out.println("M4() method "+ln);
	}
	String m5(){
		System.out.println("m5() in");
		long ln = sc.nextLong();
		obj.m4(ln);
		String str = sc.next();
		System.out.println("m5() out");
		return str;
	}
	static double m6(){
		System.out.println("m6() in");
		System.out.println(obj.m5());
		double d = sc.nextDouble();
		System.out.println("m6() out");
		return d;
	}
	char m7(int n){
		System.out.println("m7() in");
		System.out.println(m6());
		char ch = sc.next().charAt(0);
		System.out.println(n);
		System.out.println("m7() out");
		return ch;
	}
	static String m8(boolean b){
		System.out.println("m8() in");
		int n = sc.nextInt();
		System.out.println(obj.m7(n));
		System.out.println(b);
		String str = sc.next();
		System.out.println("m8() out");
		return str;
	}
	public static void main(String [] args){
		boolean b = sc.nextBoolean();
		System.out.println(m8(b));
	}
}


/* 2.create a java application where we have one class which contains static method with parameter and return type then invoke this method under main method by providing dynamic inputs without using import*/

class Sample {
    // Static method with parameters and return type
    static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Using dynamic input without importing classes
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Invoking the static method with dynamic inputs
        int result = addNumbers(num1, num2);
        System.out.println("The sum is: " + result);
    }
}


--------------------------------------day-10 08-10-2024--------------------------------------------------------------------

/* 1.create a java application where we have one class which contains non-static method m1(float & double) having params like float & double, return String value then invoke this method under main method */
import java.util.Scanner;
class Sample{
	static Scanner sc= new Scanner(System.in);
	String m1(float ft, double b){
		System.out.println(ft+" "+b);
		String str = sc.next();
		return str;
	}
	public static void main(String []args){
		Sample obj = new Sample();
		float fr = sc.nextFloat();
		double b = sc.nextDouble();
		System.out.println(obj.m1(fr,b));
	}
}

/* 2.create a java application where we have one class which contains static method m1(String, float,boolean) having params like String, float,boolean return long value, static method m2(char,int,double)having params like char,int,double and returns float value  then invoke m1 under m2 , m2 under main by providing dynamic inputs*/
import java.util.Scanner;
class Sample{
	static Scanner sc= new Scanner(System.in);
	static long m1(String s, float ft, boolean b){
		System.out.println(s+" "+ft+" "+b);
		return sc.nextLong();
	}
	static float m2(char ch, int n, double d){
		System.out.println(ch+" "+n+" "+d);
		System.out.println(m1(sc.next(),sc.nextFloat(),sc.nextBoolean()));
		return sc.nextFloat();
	}
	public static void main(String []args){					
		System.out.println(m2(sc.next().charAt(0),sc.nextInt(),sc.nextDouble()));
	}
}

/*3.create a java application where we have one class which contains non static method m1 having parameter float and returns string value then invoke this method under main method without storing the object and by providing dynamic inputs*/
import java.util.Scanner;
class Sample{
	static Scanner sc = new Scanner(System.in);
	String m1(float ft){
		System.out.println(ft);
		return sc.next();
	}
	public static void main(String []args){
		System.out.println(new Sample().m1(sc.nextFloat()));
	}
}
--------------------------------------day-11 15-10-2024--------------------------------------------------------------------
/*create a java application where we have one class which contains static method m1() having parameter float, returns string value static method m2() having parameter string returns Boolean value then invoke this two methods under main method by providing dynamic inputs ang whatever the value we are returning the m1() method has to be send as parameter for m2() method */

import java.util.Scanner;
class d27
{
	
	static Scanner sc=new Scanner(System.in);
	static String m1(float a)
	{
		System.out.println(a);
		return sc.next();
	}
	static boolean m2(String s)
	{
		System.out.println(s);
		return sc.nextBoolean();
	}
	public static void main(String[] args)
	{
		String b=m1(sc.nextFloat());
		System.out.print(m2(b));
	}
}
--------------------------------------day-12 16-10-2024--------------------------------------------------------------------
/*1.create a java application where we have one class like Employee which contains properties like id,name,salary and designation provide three employee details when displays each employee details by using a method like display which contains no parameter and returns nothing then invoke this method under main method by providing dynamically inputs*/

import java.util.Scanner;
class Sample
{
	static Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	String name=sc.next();
	float salary=sc.nextFloat();
	String designation=sc.next();
	void display()
	{
		System.out.println(id);	
		System.out.println(name);
		System.out.println(salary);
		System.out.println(designation);
	}
	public static void main(String[] args)
	{
		Sample e1=new Sample();
		e1.display();
		Sample e2=new Sample();
		e2.display();
		Sample e3=new Sample();
		e3.display();
	}
}

/*2.create a java application where we have one class like which contains  non-static method m1() having params and return type, static method m2()  having params and return type then invoke these 2 methods under main method by providing dynamic inputs and we are not allowed to create object directly */

import java.util.Scanner;

class Sample {

    static Scanner sc = new Scanner(System.in);

    // Non-static method m1() with parameters and return type
    String m1(int n) {
        System.out.println("m1 called with: " + n);
        return sc.next();  // Taking dynamic input
    }

    // Static method m2() with parameters and return type
    static int m2(String str) {
        System.out.println("m2 called with: " + str);
        return sc.nextInt();  // Taking dynamic input
    }

    // Static method to return an instance of Sample (Factory method)
    public static Sample createSample() {
        return new Sample();  // Indirect object creation
    }

    public static void main(String[] args) {
        // Create an instance using the factory method
        Sample sampleInstance = Sample.createSample();

        // Call non-static method m1() using the created instance
        System.out.println("Result of m1: " + sampleInstance.m1(sc.nextInt()));

        // Call static method m2() directly using class name
        System.out.println("Result of m2: " + Sample.m2(sc.next()));
    }
}

/* 3.Write a Java program that demonstrates a class `Sample` with the following functionality:

1. The class has two methods: `add(int a, int b)` which returns the sum of two integers, and `sub(int a, int b)` which returns the difference between two integers.
2. The class also contains a method `mul()` which:
   - Takes four integer inputs from the user using `Scanner`.
   - Uses the first two inputs for addition (`add`) and the next two for subtraction (`sub`).
   - Multiplies the results of the `add` and `sub` methods and prints the product.

Write the program such that it executes the `mul()` method inside the `main()` function. */


import java.util.Scanner;
class Sample{
	static Scanner sc = new Scanner(System.in);
	int add(int a,int b){
		return (a+b);
	}
	int sub(int a,int b){
		return (a-b);
	}
	void mul(){
		int a = add(sc.nextInt(),sc.nextInt());
		int b = sub(sc.nextInt(),sc.nextInt());
		System.out.print(a*b);
	}
	public static void main(String []args){
		Sample obj = new Sample();
		obj.mul();
	}
}


--------------------------------------day-13 19-10-2024--------------------------------------------------------------------
/* 1. create ava application where we have one class which contains non-static method m1(param) return type, static method m2(param) return type , static m3(param) return type then inkove m1() under m2() ,m2() under m3(), m3() under main method by providing dynamic inputs and we are allowed to create object only inside the main method.  */

import java.util.Scanner;
class Sample{
	static Scanner sc = new Scanner(System.in);
	String m1(int a){
		System.out.println(a);
		return sc.next();
	}
	static long m2(Sample a){
		System.out.println(a.m1(sc.nextInt()));
		return sc.nextLong();
	}
	static int m3(Sample a){
		System.out.println(m2(a));
		return sc.nextInt();
	}
	
		
	public static void main(String[] args){
		Sample obj = new Sample();
		System.out.println(m3(obj));
	}
}
	

