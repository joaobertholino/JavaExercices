package season19.deleteDatabase.db;

public class DbException extends RuntimeException {
	public DbException() {
	}

	public DbException(String message) {
		super(message);
	}
}
