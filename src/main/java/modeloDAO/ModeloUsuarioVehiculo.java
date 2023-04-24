package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modeloDTO.UsuarioVehiculo;

public class ModeloUsuarioVehiculo extends Conector{
	public ArrayList<UsuarioVehiculo> getUsuarioVehiculoIDUsuario(int id) {
		String st = "SELECT * FROM usuario_vehiculo WHERE id_usuario=?";
		ArrayList<UsuarioVehiculo> usuarioVehiculos = new ArrayList<>();
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		ModeloVehiculos modeloVehiculos = new ModeloVehiculos();
		
		modeloUsuario.conectar();
		modeloVehiculos.conectar();
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				UsuarioVehiculo usuarioVehiculo = new UsuarioVehiculo();
				
				usuarioVehiculo.setUsuario(modeloUsuario.getUsuarios(rs.getInt("id_usuario")));
				usuarioVehiculo.setVehiculo(modeloVehiculos.getVehiculo(rs.getInt("id_vehiculo")));
				
				usuarioVehiculos.add(usuarioVehiculo);
			}
			
			return usuarioVehiculos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
