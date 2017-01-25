package TestDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tw.com.lccnet.db.DBConnection;

public class TestDB {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		conn = DBConnection.GetConnection();
		
		try {
			
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM member");
			
			while (rs.next()) {
				System.out.println("id="+rs.getInt(1));
				System.out.println("name="+rs.getString(2));
				System.out.println("age="+rs.getInt(3));
				System.out.println("password="+rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnection.close(rs);
			DBConnection.close(st);
			DBConnection.close(conn);
		}

	}

}
