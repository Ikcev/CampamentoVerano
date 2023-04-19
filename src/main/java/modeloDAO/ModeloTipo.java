package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Tipo;

public class ModeloTipo extends Conector{
	public boolean insertarTipo(Tipo tipo) {
		String st = "INSERT INTO tipos (nombre, cantidad_personas, descripcion) VALUES ?, ? ,?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setString(1, tipo.getNombre());
			pst.setInt(2, tipo.getCantidad_personas());
			pst.setString(3, tipo.getDescripcion());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
