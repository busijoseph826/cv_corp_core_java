
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





