package p1;
import java.util.Scanner;
public interface I1{
	public static Scanner sc = new Scanner(System.in);
	int play(String str);
	default int m1(String str){
		System.out.println(str);
		return sc.nextInt();
	}
	
}