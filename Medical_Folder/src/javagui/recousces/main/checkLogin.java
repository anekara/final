package javagui.recousces.main;

import java.sql.SQLException;

import src.javagui.recousces.main.jdbc;

public class checkLogin {
	public String user;
	public String pass;
	public String priv;
	
	public checkLogin(String user, String pass){
				this.user=user;
				this.pass=pass;
	}
	
	public String check() throws SQLException{
		
			jdbc vash =new jdbc();
			vash.cnc();
			

			this.priv=vash.qUser(user,pass);
			return priv;
			
	}
	
}
