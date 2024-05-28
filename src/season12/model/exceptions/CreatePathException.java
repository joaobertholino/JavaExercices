package season12.model.exceptions;

public class CreatePathException extends RuntimeException {
	public CreatePathException() {
		super();
	}

	public CreatePathException(String message) {
		super(message);
	}

	public CreatePathException(String message, Throwable cause) {
		super(message, cause);
	}

	public CreatePathException(Throwable cause) {
		super(cause);
	}

	public CreatePathException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
