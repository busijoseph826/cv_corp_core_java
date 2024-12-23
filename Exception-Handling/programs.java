
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
