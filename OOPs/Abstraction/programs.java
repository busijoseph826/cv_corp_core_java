
/*Abstraction in Java is the process in which we only show essential details/functionality to the user. The non-essential implementation details are not displayed to the user. 
1.Java Abstract classes and Java Abstract methods
2.An abstract class is a class that is declared with an abstract keyword.
3.An abstract method is a method that is declared without implementation.
4.An abstract class may or may not have all abstract methods. Some of them can be concrete methods
5.A abstract method must always be redefined in the subclass, thus making overriding compulsory or making the subclass itself abstract.
6.Any class that contains one or more abstract methods must also be declared with an abstract keyword.
7.There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
8.An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.*/

/* 1.Create a java application where we have abstract class which contains one abstract method with param and return type then inherit this class into concrete class provide functionality for abstract method then invoke the method under main method by providing dynamic inputs.*/

import java.util.Scanner;
abstract class Play{
	abstract int play(String str);
}
class Cricket extends Play{
	Scanner sc = new Scanner(System.in);
	int play(String str){
		System.out.println(str+" playing cricket ");
		return sc.nextInt();
	}
	public static void main(String[]args){
		Cricket obj = new Cricket();
		System.out.print(obj.play(sc.next()));
	}
}
