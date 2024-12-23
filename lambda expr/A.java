@FunctionalInterface 
interface I{
	void play(String str);
	//void play1(int n);
}
class A{
	public static void main(String args[]){
		I obj = (str)->{
			System.out.println(str);
		};
		obj.play("joseph");
	}
}