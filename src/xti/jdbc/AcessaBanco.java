package xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcessaBanco {

	public static void main(String[] args) throws Exception {

		String sql = "Select * from pessoa";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try(
			Connection con = DriverManager.getConnection(url, "xti","xti123");
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery()) {
				while(rs.next()){
					String s = rs.getString("codigo")+" - "+rs.getString(2)+" - "+rs.getString("email");
					System.out.println(s);
				}
			}	
	}

}
