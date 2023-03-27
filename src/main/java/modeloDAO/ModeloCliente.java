package modeloDAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Cliente;

public class ModeloCliente extends Conector{
	public boolean insertarCliente(Cliente cliente) {
		
		String st = "INSERT INTO clientes (nombre, apellido, dni, email, contrasena, telefono, fecha_nacimiento) VALUES (?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setString(1, cliente.getNombre());
			pst.setString(2, cliente.getApellido());
			pst.setString(3, cliente.getDni());
			pst.setString(4, cliente.getEmail());
			pst.setString(5, cliente.getContrasena());
			pst.setInt(6, cliente.getTelefono());
			pst.setDate(7, new Date(cliente.getFechaNacimiento().getTime()));
			
			pst.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
