/*create a userdefined exception or custom defiened excption which can raise InvalidCredentialException */
import p.InvalidCredentialException;
class Gmail{
	String email = "busijoseph123@gmail.com";
	String password = "1234";
	void checkCredentials(String email,String password) throws InvalidCredentialException{
		if(this.email==email && this.password==password){
			System.out.println("Successfully Login");
		}
		else{
			InvalidCredentialException obj = new InvalidCredentialException("Invalid email or password");
			throw obj;
		}
	}
	public static void main(String[]args)throws InvalidCredentialException{
		new Gmail().checkCredentials("busijoseph123@gmail.com","124");
	}
}