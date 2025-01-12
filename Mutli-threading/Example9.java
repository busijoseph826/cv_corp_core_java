/* Create a java application where we need to create 2 custom defined threads by using runnable interface by using first thread display 1-10 numbers, by using 2nd thread 11-20 numbers then invoke run through start method*/

class A implements Runnable{
	public void run(){
		if(Thread.currentThread().getName().equals("first")) {
            		show();
        	}
		else{
           	 	dis();
        	}
	}
	void show(){
		int n = 1;
		while(n<11){
			System.out.print(n+" ");
			n++;
		}
	}
	void dis(){
		int n = 11;
		while(n<21){
			System.out.print(n+" ");
			n++;
		}
	}

	public static void main(String[]args)throws InterruptedException{
		A obj = new A();
		A obj1 = new A();
		Thread t1 = new Thread(obj,"first");
		Thread t2 =new Thread(obj1);
		t1.start();
		t1.join();
		t2.start();
		
	}
}