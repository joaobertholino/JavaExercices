package season19.transactionsDatabase.db;

public class DbException extends RuntimeException {
	public DbException() {
	}

	public DbException(String message) {
		super(message);
	}
}
