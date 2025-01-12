/*2. Create a Java Application where we have three interfaces with one abstract method each, inherit these interfaces into an abstract class where we have one parameterised constructor, one abstract method and defined method then inherit this class into three concrete classes to provide implementation of abstract methods. Invoke all the properties from a separate class test. Provide dynamic inputs.
*/

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

	B3(int a){
		super(a);
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
		
	}	
}