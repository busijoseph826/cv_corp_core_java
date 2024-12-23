/* create a java application where we have one functional interface which contains one abstract method and one defined method provide functionality for this interface by using both concrete and anonymous inner-class*/

@FunctionalInterface
interface I{
	void play(String str);	
	default void m1(int n){
		System.out.println(n);
	}
}
class A implements I{
	public void play(String str){
		System.out.println(str+" plays cricket ");
	}
}
class B extends A{
	public static void main(String args[]){
		I obj = new I(){
			public void play(String str){
				System.out.println(str+" play tennis");
			}
		};
		obj.play("joseph");
		A obj1 = new A();
		obj1.play("sundeep");
		obj.m1(4);
	}	
}