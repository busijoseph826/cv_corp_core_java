/*create a java application where we have one class which contains private fields, inside this class we have another class which contains a non-static method access private field inside this method, also contains single-param-con then access all these properties under main method by providing dynamic inputs*/

import java.util.Scanner;
class A{
	static Scanner sc = new Scanner(System.in);
	private int a = 10;
	class B{
		void m1(String str){
			System.out.println(str);
			System.out.println(a);
		}
		B(int a){
			System.out.println(a);
		}
	}
	public static void main(String args[]){
		A obj = new A();
		B obj1 = obj.new B(sc.nextInt());
		obj1.m1(sc.next());
	}
}

