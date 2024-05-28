package season19.updateDatabase.db;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {
	/**
	 * Ponteiro que armazena o objeto de conexão ao banco de dados.
	 */
	private static Connection conn = null;

	/**
	 * Método responsável por criar uma conexão com o banco de dados, caso ainda não exista, utilizando os dados do objeto
	 * {@code Properties} instanciado pelo método {@code loadProperties}, armazenando o objeto dessa conexão no ponteiro
	 * de classe.
	 *
	 * @return Um objeto do tipo {@code Connection}.
	 */
	public static Connection getConnection() {
		if (conn == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}

	/**
	 * Método responsável por fazer a leitura do arquivo {@code db.properties} armazenando seus dados de acesso em um
	 * objeto do tipo {@code Properties} retornando o mesmo.
	 *
	 * @return Um objeto do tipo {@code Properties} contendo os dados de acesso ao banco de dados.
	 */
	private static Properties loadProperties() {
		try (FileReader fs = new FileReader("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}

	/**
	 * Método responsável por fazer o fechamento do recurso de conexão ao banco de dados, tratando possíveis exceções.
	 */
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	/**
	 * Método responsável por fazer o fechamento do recurso de execução de instruções SQL, tratando possíveis exceções.
	 */
	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	/**
	 * Método responsável por fazer o fechamento do recurso que armazena os dados retornados de uma instrução SQL,
	 * tratando possíveis exceções.
	 */
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
}
