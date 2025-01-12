import java.util.Scanner;
class Gmail{
	static Scanner sc = new Scanner(System.in);
	private String username;
	private String password;
	void setName(String username){
		this.username = username;
	}
	void setPwd(String password){
		this.password = password;
	}
	String getName(){
		return username;
	}
	String getPwd(){
		return password;
	}
	Gmail(String username, String password){
		this.username = username;
		this.password = password;
		System.out.println("Before Update");
		System.out.println("Username "+username);
		System.out.println("Password "+password);

		
	}
}
class User{
	void display(Gmail obj){
		
		System.out.println("After Update");
		System.out.println("Username "+obj.getName());
		System.out.println("Password "+obj.getPwd());
	}
	public static void main(String[]args){
		Gmail obj = new Gmail(Gmail.sc.next(),Gmail.sc.next());
		obj.setName(Gmail.sc.next());
		obj.setPwd(Gmail.sc.next());
		new User().display(obj);
	}	
}