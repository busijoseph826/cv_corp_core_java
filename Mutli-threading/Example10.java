class E{
	public static void main(String[]args){
		Runnable r =new Runnable(){
			public void run(){
				System.out.println("run");
			}
		};
		Thread t1=new Thread(r);
		t1.start();
		new Thread(new Runnable(){
			public void run(){
				System.out.println("run2");
			}
		}).start();
		
		new Thread(()->{System.out.println("run3");}).start();
	}
}