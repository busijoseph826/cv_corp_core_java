/*3. Create a java application where we need to satisfy this and super keyword at both variable and constructor level.*/
import java.util.Scanner;
class A1{
	static Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	A1(){
		System.out.println("default");
	}
	A1(int a){
		this();
		System.out.println("A");
		System.out.println(a);
		System.out.println(this.a);
	}
	
}
class B1 extends A1{
	int a = sc.nextInt();
	B1(int a){
		
		super(a);
		System.out.println("B");
		System.out.println(super.a);
	}
	public static void main(String[]args){
		B1 obj = new B1(sc.nextInt());
	}
}