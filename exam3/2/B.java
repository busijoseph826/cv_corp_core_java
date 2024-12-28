/*2. Create a java application where we have one package which contains two interfaces with one abstract and defined method having parameter and return type, we have one sub-package which contains abstract class which contains one abstract and defined method, one parameterized constructor then provide implementation for this properties by using concrete class in separate package provide functionality for all the abstract methods then invoke all the properties under main by providing dynamic inputs.
*/
package p;
import p1.I1;
import p1.I2;
import p1.p2.A;
public class B extends p1.p2.A implements p1.I1,p1.I2{
	public int play(String str){
		System.out.println(str+" play cricket");
		return p1.I1.sc.nextInt();
	}
	public int play1(String str){
		System.out.println(str+" play tenis");
		return p1.I1.sc.nextInt();
	}
	public void play2(String str){
		System.out.println(str+" play vollybal");
	}
	B(int a){
		super(a);
	}
	public static void main(String[]args){
		B obj = new B(p1.I1.sc.nextInt());
		System.out.println(obj.play1(p1.I1.sc.next()));
		System.out.println(obj.play(p1.I1.sc.next()));
		obj.play2(p1.I1.sc.next());
			
	}
}
