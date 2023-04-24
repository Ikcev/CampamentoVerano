package modeloDAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Personal;

public class ModeloPersonal extends Conector{
	public boolean insertarPersonal(Personal personal) {
		String st = "INSERT INTO personal VALUES ?,?,?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setInt(1, personal.getId());
			pst.setDate(2, new Date(personal.getFechaIngreso().getTime()));
			pst.setInt(3, personal.getDirector());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean eliminarPersonal(int id) {
		String st = "DELETE FROM personal WHERE id=?";
		
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
	
	public boolean modificarPersonal(Personal personal) {
		String st = "UPDATE personal SET fech_ingreso=?, dirige=? WHERE id=?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setDate(1, new Date(personal.getFechaIngreso().getTime()));
			pst.setInt(2, personal.getDirector());
			pst.setInt(3, personal.getId());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
