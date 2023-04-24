package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Monitor;

public class ModeloMonitor extends Conector{
	private Monitor monitorHeredaUsuario(int id) {
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		modeloUsuario.conectar();
		
		Monitor monitor = (Monitor) modeloUsuario.getUsuarios(id);
		
		return monitor;
	}
	
	public boolean insertarMonitor(int id) {
		Monitor monitor = monitorHeredaUsuario(id);
		
		if (monitor == null) {
			return false;
		}
		
		String st = "INSERT INTO monitor VALUES ?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setInt(1, id);
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean eliminarMonitor(int id) {
		String st = "DELETE FROM monitores WHERE id=?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setInt(1, id);
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
