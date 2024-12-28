package p1;
public interface I{
	default void m3(){
		System.out.println("interface hi");
	}
	void play(String str);
}