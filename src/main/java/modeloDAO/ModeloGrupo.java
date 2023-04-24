package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Grupo;

public class ModeloGrupo extends Conector{
	public boolean insertarGrupo(Grupo grupo) {
		String st = "INSERT INTO grupos (id_monitor) VALUES ?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setInt(1, grupo.getMonitor().getId());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
