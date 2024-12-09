/*create  a java application where we have one class which contains static var non-static var static block and non-static block,default con,single para con, non-static & static method with para and return type then invoke all these properties under main method by providing dynamic inputs */

import java.util.Scanner;
class A{
	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	int n1 = sc.nextInt();
	static {
		System.out.println("Hello I'm static block");
	}
	{
		System.out.println("Hello I'm non-static block "+n1);
	}
	A(){
		System.out.println("Default con");
	}
	A(String str){
		System.out.println("Param con "+str);
	}
	static int m1(double db){
		System.out.println("static method "+db);
		return sc.nextInt();
	}
	int m2(double db){
		System.out.println("non-static method "+db);
		return sc.nextInt();
	}
	public static void main(String args[]){
		A obj = new A();
		A obj1 = new A(sc.next());
		System.out.println(m1(sc.nextDouble()));
		System.out.println(obj.m2(sc.nextDouble()));
		System.out.println(obj.n1+" "+n);

	}

}
