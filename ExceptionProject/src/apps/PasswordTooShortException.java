package apps;

public class PasswordTooShortException extends Exception {
	
	String msg;
	
	public PasswordTooShortException() {
		this.msg = "Password Too Short, Make a Longer password";
	}
	
	public String toString() {
		return msg;
	}
	
	public String getMessage() {
		return msg;
	}

}
