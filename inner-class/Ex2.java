/*create a java application where we have one class which contains double-pram-con and one non-static method with param and return type, inside this we have static inner class which contains non-static method then invoke all the properties under main method by providing dynamic inputs*/
import java.util.Scanner;
class A{
	static Scanner sc = new Scanner(System.in);
	A(int a,int b){
		System.out.println(a+" "+b);
	}
	int m1(String str){
		System.out.println(str);
		return sc.nextInt();
	}
	static class B{
		void m2(){
			System.out.println("hii");
		}
	}
	public static void main(String[]args){
		A obj = new A(sc.nextInt(),sc.nextInt());
		System.out.println(obj.m1(sc.next()));
		B obj1 = new B();
		obj1.m2();
	}
}