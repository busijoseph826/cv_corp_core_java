/*create a java Application where we have one interface which contains one abstract and defined method with Param & Return type , This interface Contains another interface which contains abstract & defined methods inside this interface we have Concrete class which Contains defined method with Param & retorn type, we have one abstract class in outer interface which contains Param-constructor abstract & defined method with Param & Return type then provide functionality by using separate class. and then invoke all the methods under main method by providing dynamic inputs.*/

import java.util.Scanner;
interface I{
	static Scanner sc = new Scanner(System.in);
	default int m1(String str){
		System.out.println(str);
		return sc.nextInt();
	}
	int play(String str);

	interface I1{
		default int m2(String str){
			System.out.println(str);
			return sc.nextInt();
		}
		int play1(String str);
		
		class A{
			int m3(String str){
				System.out.println(str);
				return sc.nextInt();
			}
			
		}
	}
	
	abstract class B{
		B(String str){
			System.out.println(Str);
		}
		default int m4(String str){
			System.out.println(str);
			return sc.nextInt();
		}
		int play2(String str);

	}
	
}
public class Ex1 extends I.B implements I,I.I1{
	public int play(String str){
		System.out.println(str+" play cricket ");
		return sc.nextInt();
	}
	
	public static void main(String args[]){
		Ex1 obj = new Ex1();
		System.out.println(obj.play(I.sc.nextInt()));
		System.out.println(obj.m1(I.sc.nextInt()));
		
	}
}