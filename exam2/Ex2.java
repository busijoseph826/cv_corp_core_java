/*2. create a java application where we have one class 'A' it contains 2 n-s variables without initialization and provide user defined values for them while creating object and it has one n-s method display which displays global variables and we have another class 'B' which contains a n-s method having parameter and return type then invoke this method under main method and invoke all the properties of class A while creating B class object. (hint: don't use is-a relationship)*/
import java.util.Scanner;
class A{
	int n1;
	int n2;
	A(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	void display(){
		System.out.println(n1+" "+ n2);
	}
}
class B{
	static Scanner sc = new Scanner(System.in);
	int m1(String str){
		System.out.println(str);
		return sc.nextInt();
	}
	B(){
		new A(sc.nextInt(),sc.nextInt()).display();
	}
	public static void main(String[]args){
		B obj = new B();
		System.out.println(obj.m1(sc.next()));
		
	}
}