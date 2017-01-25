package tw.com.lccnet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	/**
	 * jdbc:mysql://{ip}:{port}/{dbName}
	 */
	public static String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/persen";
	public static String JDBC_USER = "root";
	public static String JDBC_PWD = "123456";

	private static DBConnection _db = new DBConnection();
	
	static {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private DBConnection(){}
	
	public static DBConnection GetInstance(){
		return _db;
	}

	public Connection GetConnection() {

		try {
			return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PWD);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	public void close(Connection conn) {

		if (null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void close(Statement st) {

		if (null != st) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void close(PreparedStatement pt) {

		if (null != pt) {
			try {
				pt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void close(ResultSet rs) {

		if (null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
