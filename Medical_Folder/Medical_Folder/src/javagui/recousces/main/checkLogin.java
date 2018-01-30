package javagui.recousces.main;

import java.sql.SQLException;

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
			
			//return "Το username ή ο κωδικός είναι λάθος";
			this.priv=vash.qUser(user,pass);
			return priv;
			
	}
	
}
