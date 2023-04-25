package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.ClienteMascota;

public class ModeloClienteMascota extends Conector{
	public boolean insertarClienteMascota(ClienteMascota clienteMascota) {
		String st = "INSERT INTO cliente_mascota VALUES ?, ?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setInt(1, clienteMascota.getCliente().getId());
			pst.setInt(2, clienteMascota.getMascota().getId());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
