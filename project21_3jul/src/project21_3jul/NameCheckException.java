package project21_3jul;

public class NameCheckException extends Exception {

	private static final long serialVersionUID = 1L;
	private String error;

	public NameCheckException(String errorMessage) {
		super();
		this.error = errorMessage;
	}
	public String getErrorMessage() {
		return error;
	}

	public void setErrorMessage(String errorMessage) {
		this.error = errorMessage;
	}
}
