package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Actividad;

public class ModeloActividad extends Conector{
	public boolean insertarActividad(Actividad actividad) {
		String st = "INSERT INTO actividades (id_zona, nombre, cantidad_max, edad_min) VALUES ?,?,?,?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setInt(1, actividad.getZona().getId());
			pst.setString(2, actividad.getNombre());
			pst.setInt(3, actividad.getCantidad_max());
			pst.setInt(4, actividad.getEdad_min());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean eliminarActividad(int id) {
		String st = "DELETE FROM actividades WHERE id=?";
		
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
