
// 1.Write a java application where we need to handle arithmetic exception by using try catch .

class A
{
    public static void main(String[] args)
    {
	try
	{
	     System.out.print(10/0);
	}
	catch(ArithmeticException e)
	{
		System.out.print(e);
        }
    }
}

/* 2.create a java application where we need to handle number format exception by taking dynamic inputs from command line args  */

class A{
	public static void main(String[]args){
		String a=args[0];
		String b = args[1];
		try{
			int n1 = Integer.parseInt(a);
			int n2 = Integer.parseInt(b);
			System.out.print((n2+n1));
		}
		catch(NumberFormatException e){
			System.out.print(e);
		}
	}
}

/* 3.create a java application where we have three non static methods in first method we need to handle arithmetic exception in second method we need to handle number format exception in third method we need to handle input miss match exception   */

import java.util.*;
class C
{
   static Scanner sc=new Scanner(System.in);
   void m1()
   {
    	try
	{
	     System.out.print(10/0);
	}
	catch(ArithmeticException e)
	{
		System.out.print(e);
        }

   }
   void m2(String a)
   {
	
	try
	{
	   System.out.print(Float.parseFloat(a));
	}
	catch(NumberFormatException e)
	{
	    System.out.print(e);
	}

   }
   void m3(int b)
   {
	
	    System.out.print(b);
   }
public static void main(String[] args)
{
    
    C obj=new C();
     
    obj.m1(); 
    obj.m2(sc.next()); 
    try
    {
 	obj.m3(sc.nextInt());
    }
    catch(InputMismatchException e)
    {
	System.out.print(e);
    }
}
}


//4. create a java application where we need to handle multiple exception by using single try and multiple catch blocks.

class D
{
  public static void main(String[] args)
  {
	try
	{
	     System.out.print(10/0);
	     String s=" ";
	        System.out.print(s.length());
	     int a[]=new int[4];
		System.out.print(a[4]);
	}
	catch(ArithmeticException e)
	{
	    System.out.println(e);
	}
	catch(NullPointerException e)
	{
   	    System.out.print(e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	     System.out.print(e);
	}
	catch(Exception e)
	{
	    System.out.print(e);
	}
	finally
	{
	    System.out.println("Final block");
	}
  }
}

/*OUTPUT1:
java.lang.ArithmeticException: / by zero
Executed.

output2:
5
java.lang.NullPointerException: Cannot invoke "String.length()" because "A.s" is null
Executed.

Output3:
5
java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
Executed.
*/


//create a java application where we need to display exception information  in all three ways


import java.util.*;
class B
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	try
	{
	    System.out.println(10/0);
	}
	catch(ArithmeticException e)
	{
	    System.out.println(e);
	}
	try
	{
	    int a=sc.nextInt();
	}
	catch(InputMismatchException e)
	{
	    e.printStackTrace();
	}
	try
	{
	    int a[]=new int[2];
	    System.out.println(a[2]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	    System.out.println(e.getMessage());
	}
    }
}

/*Output:
java.lang.ArithmeticException: / by zero
true
java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:947)
        at java.base/java.util.Scanner.next(Scanner.java:1602)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
        at B.main(B.java:18)
Index 2 out of bounds for length 2
*/


/*5. create  a java application where we need to handle checked exception like file not found exception */

import java.io.*;
class F
{
   public static void main(String[] args) throws FileNotFoundException 
   {
	FileInputStream fos=new FileInputStream("C:\\Users\\patha\\OneDrive\\Desktop\\Core Java\\Exception Handling\\sample1.txt");
	System.out.print("done");
    }
}

/*create  a java application where we need to handle checked exception like file not found exception by using try catch*/

import java.io.*;
class G
{
   public static void main(String[] args)  
   {
	try
	{
	FileInputStream fos=new FileInputStream("C:\\Users\\patha\\OneDrive\\Desktop\\Core Java\\Exception Handling\\sample.txt");
	}
	catch(FileNotFoundException e)
	{
	    System.out.print(e);
	}
	System.out.print("done");
    }
}
