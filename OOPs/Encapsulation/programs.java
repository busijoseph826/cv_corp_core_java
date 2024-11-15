/* 1.Create a java application where we have one class which contains 2 private fields like user_name and password provide setter and getter methods for both user name and password then invoke these methods under main by with respect to user class by providing dynamic inputs.*/

import java.util.Scanner;
class Bank{
	private String user_name ="jose";
	private String password = "123@sunny";
	void setUserName(String user_name){
		this.user_name = user_name;
	}
	String getUserName(){
		return user_name;
	}
	void setPassword(String password){
		this.password = password;
	}
	String getPassword(){
		return password;
	}
}
class User{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Bank obj = new Bank();
		obj.setUserName(sc.next());
		System.out.println(obj.getUserName());

		obj.setPassword(sc.next());
		System.out.println(obj.getPassword());
	}
}


//2.Create a java application where we have one class which contains private field like atm_pin provide setter and getter methods atm_pin then invoke these methods under main by with respect to user class by providing dynamic inputs.*/

import java.util.Scanner;
class Bank{
	private int atm_pin =1234;
	void setAtmPin(int atm_pin){
		this.atm_pin = atm_pin;
	}
	int getAtmPin(){
		return atm_pin;
	}
}
class User{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Bank obj = new Bank();
		obj.setAtmPin(sc.nextInt());
		System.out.println(obj.getAtmPin());
	}
}

/*3.create a java application  where we have 3 private fields without values provide USER DEFINED VALUES while creating object and retrieve the updated values by using the getter methods wrt user class update and retrieve the values*/

import java.util.Scanner;
class BankApplication{
	private String user_name,password,pin;
	BankApplication(String user_name, String password, String pin){
		this.user_name = user_name;
		this.password = password;
		this.pin = pin;
		System.out.println("Before Update "+user_name+" "+password+" "+pin);
	}
	void setUserName(String user_name){
		this.user_name = user_name;
	}
	String getUserName(){
		return user_name;
	}
	void setPassword(String password){
		this.password = password;
	}
	String getPassword(){
		return password;
	}
	void setPin(String pin){
		this.pin = pin;
	}
	String getPin(){
		return pin;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		BankApplication obj = new BankApplication(sc.next(),sc.next(),sc.next());
		obj.setUserName(sc.next());
		obj.setPassword(sc.next());
		obj.setPin(sc.next());
		System.out.println("After updating "+obj.getUserName()+" "+obj.getPassword()+" "+obj.getPin());
	}
}
