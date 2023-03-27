package modeloDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class Conector {
	protected Connection connection;
	
	public void conectar() {
		
	}
	
	public void cerrar() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
