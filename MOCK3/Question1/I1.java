package p1;

public interface I1{
	void play1(String str);
	default void m1(int n){
		System.out.println(n);
	}
	
	interface I2{
		void play2(String str);
	}
}