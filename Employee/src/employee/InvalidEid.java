package employee;

public class InvalidEid extends Exception {
	public String getMessage() {
		return "Invalid Employee Id";
	}
}
