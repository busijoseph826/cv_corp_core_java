//1. Create a java application where we have one class which contains one static variable,non-static variable non-static method and static method with parameter and return type, default constructor, single parameterized constructor then invoke all the properties under main method by using single statement and by providing dynamic inputs.
import java.util.Scanner;

class Sample1{
	static Scanner sc = new Scanner(System.in);
	static int num = sc.nextInt();
	String str = sc.next();
	Sample1(){
		System.out.println("default constructor");
	}
	Sample1(int n1,int n2){
		System.out.println("parameterised con "+n1+" "+n2);
	}
	static int m1(String str1){
		System.out.println("static method "+str1);
		return sc.nextInt();
	}
	static Sample1 obj = new Sample1();
	int m2(float ft){
		System.out.println("non-static method "+ft);
		System.out.println("static varible "+num);
		System.out.println("non-static varible "+str);
		return sc.nextInt();

	}
	public static void main(String[]args){
		new Sample1(m1(sc.next()),obj.m2(sc.nextFloat()));
	}
}
//2. Create a java application where we need to satisfy constructor and method overloading, method overriding by using two classes.
import java.util.Scanner;
class A{
	static Scanner sc = new Scanner(System.in);
	A(int num){
		System.out.println(num);
	}
	A(String str,long ln){
		this(sc.nextInt());
		System.out.println(str+" "+ln);
	}
	void play(String str){
		System.out.println("class A "+str+" playing cricket");
	}
	void play(int n,String str){
		System.out.println("class A "+str+" playing cricket for "+n+" hour");
	}

}
class B extends A{
	B(){
		super(sc.next(),sc.nextLong());
	}
	void play(String str){
		super.play(sc.next());
		System.out.println("class B "+str+" playing tennis");
	}
	void play(int n,String str){
		super.play(sc.nextInt(),sc.next());
		System.out.println("class B "+str+" playing tennis for "+n+" hour");
	}
	public static void main(String args[]){
		B obj = new B();
		obj.play(sc.next());
		obj.play(sc.nextInt(),sc.next());
	}

}
//3. Create a java application where we have one class which contains two private fields without values, provide user defined values by using constructor provide setter and getter methods then update and retrieve the values with respect through user class.
import java.util.Scanner;
class Bank{
	static Scanner sc = new Scanner(System.in);
	private int atm_pin;
	private String password;
	Bank(int atm_pin,String password){
		this.atm_pin = atm_pin;
		this.password = password;
	}
	void setAtmpin(int atm_pin){
		this.atm_pin = atm_pin;
	}
	int getAtmpin(){
		return atm_pin;	
	}	
	void setPassword(String password){
		this.password = password;
	}
	String getPassword(){
		return password;
	}
}
class User extends Bank{
	User(){
		super(sc.nextInt(),sc.next());
	}
	public static void main(String[]args){
		User obj = new User();
		obj.setAtmpin(sc.nextInt());
		obj.setPassword(sc.next());
		System.out.print("updated values "+obj.getAtmpin()+" "+obj.getPassword());
		
	}
}
// 4. Create a java application where we have one class which contains two non-static variables, one static variable then inherit this class in to three different classes where each individual class contains one non-static method like display with parameter and retum type access variables inside this method then invoke all the individual methods under main method by
providing dynamic inputs

import java.util.Scanner;
class A{
	static Scanner sc = new Scanner(System.in);
	String str1 = sc.next();
	String str2 = sc.next();
	static int n = sc.nextInt();
}
class B extends A{
	String display(int num){
		System.out.println(str1+" "+str2+" "+num);
		return sc.next();
	}
}
class C extends A{
	int display(long ln){
		System.out.println(str1+" "+str2+" "+ln);
		return sc.nextInt();
	}

}
class D extends A{
	int display(int db){
		System.out.println(str1+" "+str2+" "+db);
		return sc.nextInt();
	}

}
public class Test{
	public static void main(String[]args){
		B obj1 = new B();
		System.out.println(obj1.display(A.sc.nextInt()));
		C obj2 = new C();
		System.out.println(obj2.display(A.sc.nextLong()));
		C obj3 = new C();
		System.out.println(obj3.display(A.sc.nextInt()));	
	}
}
