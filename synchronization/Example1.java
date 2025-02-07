class E{
	int i;
	synchronized void inc(){
		i++;
	}
}
class T1 extends Thread{
	static E obj;
	T1(E obj){
		this.obj = obj;
	}
	public void run(){
		for(int i=0;i<100;i++){
			obj.inc();
		}
	}
}
class T2 extends Thread{
	static E obj;
	T2(E obj){
		this.obj=obj;
	}
	public void run(){
		for(int i=0;i<100;i++){
			obj.inc();
		}
	}
	public static void main(String[]args) throws InterruptedException{
		E obj = new E();
		T1 t1 = new T1(obj);
		T2 t2 = new T2(obj);
		t1.start();
		t2.start();
		t2.join();
		System.out.print(obj.i);
	}
}