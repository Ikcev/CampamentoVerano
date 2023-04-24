package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Limpieza;

public class ModeloLimpieza extends Conector{
	private Limpieza limpiezaHeredaUsuario(int id) {
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		modeloUsuario.conectar();
		
		Limpieza limpieza = (Limpieza) modeloUsuario.getUsuarios(id);
		
		return limpieza;
	}
	
	public boolean insertarLimpieza(int id) {
		Limpieza limpieza = limpiezaHeredaUsuario(id);
		
		if (limpieza == null) {
			return false;
		}
		
		String st = "INSERT INTO limpieza VALUES ?,?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setInt(1, limpieza.getId());
			pst.setInt(2, limpieza.getZona().getId());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean eliminarLimpieza(int id) {
		String st = "DELETE FROM limpieza WHERE id=?";
		
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
