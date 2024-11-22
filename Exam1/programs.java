//1) create a Java application where we have one class, it contains two instance variables without values and provides user-defined values for instance variables by using the double parameterized constructor, we need to have one object parameterized constructor if we call the instance variables through an object of the object parameterized constructor we need to get the same user-defined values whatever we are giving for the double parameterized constructor.
import java.util.Scanner;
class Sample1{
	static Scanner sc = new Scanner(System.in);
	int num1 ;
	int num2;
	Sample1(int num1,int num2){
		this.num1 = num1;
		this.num2 =num2; 
	}
	Sample1(Sample1 obj){
		this.num1 = obj.num1;
		this.num2 = obj.num2;
		//System.out.println(obj.num1+" "+obj.num2);
	}
	public static void main(String[]args){
		Sample1 obj1 = new Sample1(new Sample1(sc.nextInt(),sc.nextInt()));
		System.out.print(obj1.num1+" "+obj1.num2);
	}
}

//2) create a Java application where we need to satisfy polymorphism (overloading and overriding)?
import java.util.Scanner;
class A{
	static Scanner sc = new Scanner(System.in);
	void play(String str){
		System.out.println("class A "+str+" playing cricket");
	}
	void play(int n,String str){
		System.out.println("class A "+str+" playing criket "+n+" hours");
	}
}
class B extends A{
	void play(String str){
		super.play(sc.next());
		System.out.println("class B "+str+" playing tennis");
	}
	void play(int n, String str){
		this.play(sc.next());
		super.play(sc.nextInt(),sc.next());
		System.out.println("class B "+str+" playing tennis "+n+" hours");
	}
	public static void main(String[]args){
		B obj = new B();
		obj.play(sc.nextInt(),sc.next());
	}
}

//3) create a Java application where we have one class A it contains private variables like student id, student name, student branch with out values. We need to inherit A class properties in to three different classes and provide the details each class contains respective display methods to display the provided values. Invoke all these display methods in to main method of separate test class.
import java.util.Scanner;
class A{
	static Scanner sc = new Scanner(System.in);
	private int stu_id;
	private String name;
	private String branch;
	
	void setId(int stu_id){
		this.stu_id = stu_id;
	}
	int getId(){
		return stu_id;
	}
	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}
	void setBranch(String branch){
		this.branch = branch;
	}
	String getBranch(){
		return branch;
	}

}
class Stu1 extends A{
	
	void display(){
		super.setId(sc.nextInt());
		super.setName(sc.next());
		super.setBranch(sc.next());
		System.out.println(super.getId()+" "+super.getName()+" "+super.getBranch());
	}
}
class Stu2 extends A{
	void display(){
		super.setId(sc.nextInt());
		super.setName(sc.next());
		super.setBranch(sc.next());
		System.out.println(super.getId()+" "+super.getName()+" "+super.getBranch());
	}

}
class Stu3 extends A{
	void display(){
		super.setId(sc.nextInt());
		super.setName(sc.next());
		super.setBranch(sc.next());
		System.out.println(super.getId()+" "+super.getName()+" "+super.getBranch());
	}

}

public class Test{
	public static void main(String[]args){
		Stu1 obj1 = new Stu1();
		obj1.display();
		Stu2 obj2 = new Stu2();
		obj1.display();
		Stu3 obj3 = new Stu3();
		obj3.display();

	}
}
