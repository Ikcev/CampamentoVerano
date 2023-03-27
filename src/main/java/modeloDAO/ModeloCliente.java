package modeloDAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	public boolean eliminarCliente(int id) {
		
		String st = "DELETE FROM clientes WHERE id = ?";
		
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
	
	public boolean modificarCliente(Cliente cliente) {
		
		String st = "UPDATE clientes SET nombre = ?, apellido = ?, dni = ?, email = ?, contrasena = ?, telefono = ?, fecha_nacimiento = ? WHERE id = ?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setString(1, cliente.getNombre());
			pst.setString(2, cliente.getApellido());
			pst.setString(3, cliente.getDni());
			pst.setString(4, cliente.getEmail());
			pst.setString(5, cliente.getContrasena());
			pst.setInt(6, cliente.getTelefono());
			pst.setDate(7, new Date(cliente.getFechaNacimiento().getTime()));
			pst.setInt(8, cliente.getId());

			pst.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public Cliente getCliente(int id) {
		
		Cliente cliente = new Cliente();
		String st = "SELECT * FROM clientes WHERE id = ?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			rs.next();
			
			cliente.setId(rs.getInt("id"));
			cliente.setNombre(rs.getString("nombre"));
			cliente.setApellido(rs.getString("apellido"));
			cliente.setEmail(rs.getString("email"));
			cliente.setContrasena(rs.getString("email"));
			cliente.setTelefono(rs.getInt("telefono"));
			cliente.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
			
			return cliente;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
