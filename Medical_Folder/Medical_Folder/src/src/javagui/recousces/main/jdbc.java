package javagui.recousces.main;
import java.sql.*;

import javax.sql.*;

public class jdbc {
	
	Connection conn;
	public String priv;
	
	
	public void cnc(){
		
		
		String url = "jdbc:mysql://127.0.0.1:3306/";
		String dbName = "thanos";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "";

		try {
		      Class.forName(driver);
		      conn = DriverManager.getConnection(url+dbName,userName,password);
		      
		      
		    } catch (Exception e) {
		      e.printStackTrace();
		    }

		}
	
	public String qUser(String user,String pass) throws SQLException{
		
		Statement stmt = conn.createStatement() ;
		String query = "SELECT * FROM users WHERE user='"+user+"'and pass='"+pass+"'";
		ResultSet rs = stmt.executeQuery(query) ;
	
		while(rs.next())
		{
		   
			String p = rs.getString(4);
		    
		    priv=p.toString();
		}
		conn.close();
			return priv;
		
	}
	
	

	

}
