package season19.updateDatabase.db;

public class DbException extends RuntimeException {
	public DbException() {
	}

	public DbException(String message) {
		super(message);
	}
}
