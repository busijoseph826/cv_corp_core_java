package p1;
import p1.I1;
public interface I2{
	int play1(String str);
	default int m2(String str){
		System.out.println(str);
		return I1.sc.nextInt();
	}
	
}