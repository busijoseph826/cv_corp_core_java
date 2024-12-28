/*1. Create a java application where have one class which contains two private fields provide user defined values for these private fields by using constructor injection, setter injection and getter methods and by using user class provide and get back the values.
*/
import java.util.Scanner;
class A{
	private int id;
	private String name;
	A(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println(id+" "+name);
	}
	void setId(int id){
		this.id = id;
	}
	int getId(){
		return id;
	}
	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}
	public static void main(String[]args){
		A obj = new A(1,"jo");
		obj.setId(2);
		obj.setName("sun");
		System.out.println(obj.getId()+" "+obj.getName());
	}
}