/*create a java application where we need to create on class which contains two non static methods() then invoke these two methods under run method of custom defined thread class the invoke run through start method*/

class A{
	void show(){
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println("Hii show");
	}
	void display(){
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println("Hii display");
	}
}
class Thread1 extends Thread{
	public void run(){
		new A().show();
		new A().display();
	}
	public static void main(String[]args){
		Thread1 t1 = new Thread1();
		t1.start();
	}
}