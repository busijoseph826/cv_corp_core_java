/*3. create a java application where we have one package and it has one class which contains one n-s method and one member inner class this inner class contains one n-s method and this package contains one interface having one abstract method and one defined method and this package has one sub-package and it contains one abstract class having one abstract method and one parameterized constructor then invoke all the properties in a seperate package having one concrete class. (hint: use lambda expression and annonymous inner class)*/

package p;
//import p1.A;
//import p1.I;
//import p1.p2.C;
public class D{
	public static void main(String[]args){
		p1.A obj = new p1.A();
		obj.m1();
		p1.A.B obj1 = obj.new B();
		obj1.m2();

		p1.I obj3 = (str)->{
			System.out.println(str+" play cricket");
		};
		obj3.play("joe");
		obj3.m3();
		
		p1.p2.C obj4 = new p1.p2.C(7){
			public void play1(String str){
				System.out.println(str+" play tennis");
			}
		};
		obj4.play1("sun");
		obj4.m4();
		
	}
}