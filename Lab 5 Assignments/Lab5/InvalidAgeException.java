package Lab5;
public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super();//acquring the parent class methods
	}

	public InvalidAgeException(String msg) {
		super(msg);
	}
}