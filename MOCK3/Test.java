/*3. Create a Java Application where we have a class Gmail which contains two private fields like username and password. Generate getter and setter methods, Constructor Injection for these private fields. We also have a class named User where we have one non static method named display with Gmail object as parameter. This method is used to display the private fields of Gmail class. update the private fields under main method and retrieve them from display method. Provide Dynamic inputs.*/
import java.util.Scanner;
interface I1{
	void play1(String str);
}
interface I2{
	void play2(String str);
}
interface I3{
	void play3(String str);
}
abstract class A implements I1,I2,I3{
	A(int n){
		System.out.println("constructor "+n);
	}
	
	abstract void play4(String str);
	void m1(int n){
		System.out.println(n);
	}
}

class B1 extends A{
	public void play1(String str){
		System.out.println(str+" play cricket");
	}
	public void play2(String str){
		System.out.println(str+" play tennis");
	}
	public void play3(String str){
		System.out.println(str+" play vollyball");
	}

	B1(int a){
		super(a);
		System.out.println("In B1");
	}
	void play4(String str){
		System.out.println(str+" play kabaddi");
	}
}
class B2 extends A{
	public void play1(String str){
		System.out.println(str+" play cricket");
	}
	public void play2(String str){
		System.out.println(str+" play tennis");
	}
	public void play3(String str){
		System.out.println(str+" play vollyball");
	}

	B2(int a){
		super(a);
		System.out.println("In B2");
	}
	void play4(String str){
		System.out.println(str+" play hockey");
	}
}
class B3 extends A{
	public void play1(String str){
		System.out.println(str+" play cricket");
	}
	public void play2(String str){
		System.out.println(str+" play tennis");
	}
	public void play3(String str){
		System.out.println(str+" play vollyball");
	}

	B3(int a){
		super(a);
		System.out.println("In B3");
	}
	void play4(String str){
		System.out.println(str+" play foodbal");
	}
}

class Test{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		B1 obj1 = new B1(sc.nextInt());
		obj1.play1(sc.next());
		obj1.play2(sc.next());
		obj1.play3(sc.next());
		obj1.play4(sc.next());
		
		B2 obj2 = new B2(sc.nextInt());
		obj2.play1(sc.next());
		obj2.play2(sc.next());
		obj2.play3(sc.next());
		obj2.play4(sc.next());
		
		B3 obj3 = new B3(sc.nextInt());
		obj3.play1(sc.next());
		obj3.play2(sc.next());
		obj3.play3(sc.next());
		obj3.play4(sc.next());
		
	}	
}