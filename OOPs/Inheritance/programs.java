/* 1. create a java application where we have one class which contains non-static mthod m1() having param and return type, we have anther class which contains static method m2() having param and return type then invoke m1,m2 under main method by providing dynamic inputs*/

import java.util.Scanner;

class Sample{
	static Scanner sc = new Scanner(System.in);
	int m1(String s){
		System.out.println("m1() method");
		System.out.println(s);
		return sc.nextInt();
	}
}
class Sample1 extends Sample{
	static int m2(String s){
		System.out.println("m2() method");
		System.out.println(s);
		return sc.nextInt();
	}
	public static void main(String[]args){
		System.out.println(new Sample1().m1(sc.next()));
		System.out.println(m2(sc.next()));
	}
}
