package updateDatabase.application;

import updateDatabase.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
//		Declarando os ponteiros referentes aos recursos de conexão ao banco e ao objeto de instrução SQL.
		Connection connection;
		PreparedStatement preparedStatement = null;

		try {
//			Executando o método que ira estabelecer a conexão ao banco de dados.
			connection = DB.getConnection();
//			Passando ao ponteiro um objeto de instrução SQL.
			preparedStatement = connection.prepareStatement("UPDATE employee SET BaseSalary = BaseSalary + ? WHERE (DepartmentId = ?)");

//			Passando os valores aos placeholders.
			preparedStatement.setDouble(1, 200.00);
			preparedStatement.setDouble(2, 1);

//			Executando a instrução SQL do objeto retornando o numero de linhas afetadas pela execução.
			int rowsAffected = preparedStatement.executeUpdate();
//			Imprimindo no console o numero de linhas afetadas.
			System.out.println("Rows Affected: " + rowsAffected);
		} catch (SQLException e) {
//			Imprimindo a mensagem de exceção, caso seja lançada uma.
			System.err.println(e.getMessage());
		} finally {
//			Encerrando recursos utilizados.
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}
	}
}
