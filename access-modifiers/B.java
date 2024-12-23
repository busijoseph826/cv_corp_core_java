package p1;
public class B{
	public void m2(){
		System.out.println("with in the package");
		System.out.println(new A().b);
		System.out.println(new A().c);
		System.out.println(new A().d);
		new A().m1();
	}	
}