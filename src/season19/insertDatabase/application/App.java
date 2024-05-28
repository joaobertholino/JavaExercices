package insertDatabase.application;

import insertDatabase.db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

//		Declaração de ponteiros referentes aos recursos de conexão ao banco de dados e ao objeto responsável por executar a instrução SQL.
		Connection connection;
		PreparedStatement preparedStatement = null;
		try {
//			Conectando ao banco de dados.
			connection = DB.getConnection();
//			Criando um objeto do tipo preparedStatement que executa uma instrução SQL e retorna valores de chaves geradas automaticamente.
			preparedStatement = connection.prepareStatement(
					"INSERT INTO employee (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);

//			Utilizando método set para passar valores aos placeholders da instrução SQL.
			preparedStatement.setString(1, "Lucas Montano");
			preparedStatement.setString(2, "lucasmontano@gmail.com");
			preparedStatement.setDate(3, new Date(sdf.parse("22/04/1985").getTime()));
			preparedStatement.setDouble(4, 20000.00);
			preparedStatement.setInt(5, 1);

//			Verificando se o numero de linha modificadas no banco é maior que zero.
			if (preparedStatement.executeUpdate() > 0) {
//				Instanciando um objeto do tipo ResultSet contendo os valores de chaves geradas após a execução do objeto PreparedStatement.
				ResultSet resultSet = preparedStatement.getGeneratedKeys();
//				Imprimindo no console cada umas da chaves geradas por meio de uma iteração no objeto ResultSet.
				while (resultSet.next()) {
					System.out.println("Done! Id: " + resultSet.getInt(1));
				}
			} else System.out.println("No rows affected!");
		} catch (SQLException | ParseException e) {
			e.printStackTrace();
		} finally {
//			Fechamento de recursos visando evitar vazamentos de memoria.
			DB.closeStatement(preparedStatement);
			DB.closeConnection();
		}
	}
}
