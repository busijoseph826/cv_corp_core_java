/* 1. Create a java Application where we need one user defined package which contains one class which contains properties like non-static variables , non-static method and parameterized constructor then access all these properties under main method of separate class in separate package.*/

package p1;
import java.util.Scanner;
public class A{
	public static Scanner sc = new Scanner(System.in);
	public int n = sc.nextInt();
	public A(String str){
		System.out.println("param con "+str);
	}
	public double m1(String str){
		System.out.println(str);
		return sc.nextDouble();
	}
}