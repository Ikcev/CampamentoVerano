package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Cliente;

public class ModeloCliente extends Conector{
//	private Cliente clienteHeredaUsuario(int id) {
//		ModeloUsuario modeloUsuario = new ModeloUsuario();
//		modeloUsuario.conectar();
//		
//		Cliente cliente = (Cliente) modeloUsuario.getUsuarios(id);
//		
//		return cliente;
//	}
	
	public boolean insertarCliente(Cliente cliente) {
		String st = "INSERT INTO clientes VALUES ?,?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setInt(1, cliente.getId());
			pst.setInt(2, cliente.getGrupo().getId());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean eliminarCliente(int id) {
		String st = "DELETE FROM clientes WHERE id=?";
		
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
