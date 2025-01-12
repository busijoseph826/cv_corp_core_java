/*Create a java application where we need to create 3 custom defined threads 1st thread had to display 1 to 10 numbers  2nd thread had to display a-z characters 3rd thread has to display 20 to 30 , then run method through start method result should be in order*/

class T extends Thread{

	public void run()
	{	
		Thread t1 = Thread.currentThread();
		if(t1.getName().equals("first")){
			for(int i=1;i<=10;i++)
			{
				System.out.println("t1 "+i);
			}
		}
		else if(t1.getName().equals("second")){
			for(char  i='a';i<='z';i++)
			{
				System.out.println("t2 "+i);
			}
		}
		else{
			for(int i=20;i<=30;i++)
			{
				System.out.println("t3 "+i);
			}
		}

	}	
}
class Test {
	
	public static void main(String[]args) throws InterruptedException {
		T t1 = new T();
		t1.setName("first");
		t1.start();
		t1.join();
		T t2 = new T();t2.setName("second");
		t2.start();
		t2.join();
		T t3 = new T();t3.setName("third");
		t3.start();
		t3.join();
	}	
}