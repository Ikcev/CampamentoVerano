package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Vehiculo;

public class ModeloVehiculos extends Conector{
	public boolean insertarVehiculo(Vehiculo vehiculo) {
		String st = "INSERT INTO vehiculos(matricula, marca, modelo, color) VALUES ?,?,?,?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setString(1, vehiculo.getMatricula());
			pst.setString(2, vehiculo.getMarca());
			pst.setString(3, vehiculo.getModelo());
			pst.setString(4, vehiculo.getColor());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean eliminarVehiculo(int id) {
		String st = "DELETE FROM vehiculos WHERE id=?";
		
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
	
	public boolean modificarVehiculo(Vehiculo vehiculo) {
		String st = "UPDATE vehiculos SET matricula=?, marca=?, modelo=?, color=? WHERE id=?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setString(1, vehiculo.getMatricula());
			pst.setString(2, vehiculo.getMarca());
			pst.setString(3, vehiculo.getModelo());
			pst.setString(4, vehiculo.getColor());
			pst.setInt(5, vehiculo.getId());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
