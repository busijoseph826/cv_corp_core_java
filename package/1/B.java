package p2;
import p1.*;
public class B{
	public static void main(String[]args){
		A obj = new A(A.sc.next());
		System.out.println(obj.n);
		System.out.println(obj.m1(A.sc.next()));
	}
}