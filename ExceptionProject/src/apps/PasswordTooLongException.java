package apps;

public class PasswordTooLongException extends Exception {
	
	String msg;
	
	public PasswordTooLongException(){
		this.msg = "Password too Long. Enter Shorter Password";
	}
	
	public String toString() {
		return msg;
	}
	
	public String getMessage() {
		return msg;
	}

}
