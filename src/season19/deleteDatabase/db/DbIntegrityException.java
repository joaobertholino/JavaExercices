package deleteDatabase.db;

public class DbIntegrityException extends RuntimeException {
	public DbIntegrityException() {
	}

	public DbIntegrityException(String message) {
		super(message);
	}
}
