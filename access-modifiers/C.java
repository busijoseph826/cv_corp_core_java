package p2;
import p1.*;
public class C extends A{
	public static void main(String[]args){
		C obj = new C();
		System.out.println("outside of the package");
		System.out.println(obj.c);
		System.out.println(obj.d);
		new B().m2();
		
	}
}