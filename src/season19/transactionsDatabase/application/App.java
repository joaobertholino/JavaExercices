package transactionsDatabase.application;

import transactionsDatabase.db.DB;
import transactionsDatabase.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) {
//		Declarando ponteiros referentes ao objeto de conexão ao banco de dados e ao objeto de execução da instrução SQL.
		Connection connection = null;
		Statement statement = null;

		try {
//			Utilizando método que instancia um objeto de conexão ao banco de dados.
			connection = DB.getConnection();
//			Utilizando método que define a confirmação de alterações no banco de dados como false(manual).
			connection.setAutoCommit(false);
//			Utilizando método que instancia um objeto de execução de instruções SQL a partir do objeto de conexão.
			statement = connection.createStatement();

//			Utilizando método que irá executar a instrução SQL passada como argumento, retornando o numero de linha afetadas.
			int rowsOne = statement.executeUpdate("UPDATE employee SET BaseSalary = 30090 WHERE departmentId = 1");
//			Simulação de exceção ocorrendo durante a alteração de valores do banco de dados.
//			if (true) throw new SQLException("Fake Error");
			int rowsTwo = statement.executeUpdate("UPDATE employee SET BaseSalary = 40090 WHERE departmentId = 2");
//			Utilizando método que confirma todas as alteração feitas no banco de dados.
			connection.commit();

//			Imprimindo no console o numero de linha afetadas em cada uma das instruções executadas.
			System.out.println("RowsOne: " + rowsOne);
			System.out.println("RowsTwo: " + rowsTwo);
		} catch (SQLException e) {
			try {
//				Utilizando método que ira desfazer todas as alterações feitas no banco de dados na transação atual.
				connection.rollback();
//				Lançando uma exceção caso ocorra um erro durante o processo de transação.
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException ex) {
//				Lançando uma exceção caso ocorra um erro no processo de rollback.
				throw new DbException("Error trying to rollback! Caused by: " + ex.getMessage());
			}
		} finally {
//			Finalizando recursos utilizados na conexão ao banco de dados e no objeto de execução de instruções SQL.
			DB.closeStatement(statement);
			DB.closeConnection();
		}
	}
}
