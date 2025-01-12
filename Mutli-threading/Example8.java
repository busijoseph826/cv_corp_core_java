/*Create a java application where we have one class which contains non-static method m1() having param and return type then invoke this method under main method by using custom defined thread object*/

class A{
	void m1(String str){
		System.out.println(str);
	}
}
class B extends A implements Runnable{
	public void run(){
		System.out.println("run");
	}
	public static void main(String[]args){
		B obj = new B();
		Thread t1 = new Thread(obj);
		t1.start();
		obj.m1("joseph");
	}
}



