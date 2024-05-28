package recoveryDatabase.application;

import recoveryDatabase.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) {
		Connection conn;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
//			Executando método que estabelece uma conexão com o banco de dados retornando um objeto do tipo Connection.
			conn = DB.getConnection();
//			Executando método que instancia um objeto do tipo Statement para a execução de instruções SQL.
			statement = conn.createStatement();
//			Executando método que recebe uma instrução SQL como argumento retornando um objeto do tipo ResultSet.
			resultSet = statement.executeQuery("select * from employee");
//			Utilizando o método next para verificar se há uma próxima linha na tabela retornando um boolean de acordo.
			while (resultSet.next()) {
//				Executando método que retorna o valor de um determinado tipo, da linha atual, da coluna passada como argumento.
				System.out.println(resultSet.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			Utilizando métodos auxiliares para finalizar os recursos utilizados, prevenindo vazamentos de memória.
			DB.closeStatement(statement);
			DB.closeResultSet(resultSet);
			DB.closeConnection();
		}
	}
}
