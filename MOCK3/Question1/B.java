/*1. Create a Java Application where we have one package P1, which contains one interface  with one abstract and defined method inside this interface we have one more interface with one abstract method, in the same package we also have one Abstract class with one parameterised constructor, one defined and one abstract method, one concrete class with one parameterised constructor, one defined method. Then inherit all these templates into a concrete class of separate Package P2 and provide functionalities for all abstract methods by using lambda wherever possible. Provide dynamic inputs.
*/
package p2;
import p1.I1;
import p1.I1.I2;
import p1.A;
import java.util.Scanner;
public class B extends p1.A{
	public B(String str){
		super(str);
	}
	public void play3(String str){
		System.out.println(str+" play vollyball");
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		I1 obj=(str)->{
			System.out.println(str+" play cricket");
		};
		obj.play1(sc.next());
		obj.m1(sc.nextInt());
		I1.I2 obj1 = (str)->{
			System.out.println(str+" play tennis");
		};
		obj1.play2(sc.next());
		
		B obj2 = new B(sc.next());
		obj2.play3(sc.next());
		obj2.m2(sc.nextInt());
	}	
}