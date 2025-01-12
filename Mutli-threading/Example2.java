/*Create a java application where we need to create one custom defined thread and display 1-10 numbers by using run method then invoke run through start method */

class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[]args){
		MyThread t1 = new MyThread();
		t1.start();
	}
}