/* Create  java application where we need to create 3 custom defined threads 1st thread has to display 1 to 10 numbers , 2nd thread has to display 11 to 20 numbers 3rd thread has to display 21 to 30 numbers then invoke run method through start method */

class Thread1 extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("t1 "+i);
		}
	}	
}
class Thread2 extends Thread{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.println("t2 "+i);
		}
	}	
}
class Thread3 extends Thread{
	public void run()
	{
		for(int i=21;i<=30;i++)
		{
			System.out.println("t3 "+i);
		}
	}	
}
class Test {
	public static void main(String[]args){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.start();
		t2.start();
		t3.start();
		
	}	
}