package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Mascota;

public class ModeloMascota extends Conector{
	public boolean insertarMascota(Mascota mascota) {
		
		String st = "INSERT INTO mascotas (nombre, num_chip, raza) VALUES (? ?, ?)";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setString(1, mascota.getNombre());
			pst.setInt(2, mascota.getNumChip());
			pst.setString(3, mascota.getRaza());
			
			pst.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean eliminarMascota(int id) {
		
		String st = "DELETE FROM mascotas WHERE id = ?";
		
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
	
	public boolean modificarMascota(Mascota mascota) {
		
		String st = "UPDATE mascotas SET nombre = ?, num_chip = ?, raza = ? WHERE id = ?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setString(1, mascota.getNombre());
			pst.setInt(2, mascota.getNumChip());
			pst.setString(3, mascota.getRaza());
			pst.setInt(4, mascota.getId());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
