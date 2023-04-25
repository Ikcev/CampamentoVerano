package modeloDAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Reserva;

public class ModeloReserva extends Conector{
	public boolean insertarReserva(Reserva reserva) {
		String st = "INSERT INTO reservas (id_parcela,id_clientes,fecha_ingreso,fecha_salida) VALUES (?,?,?,?)";

		try {
			PreparedStatement pst = super.connection.prepareStatement(st);

			pst.setInt(1, reserva.getParcela().getId());
			pst.setInt(2, reserva.getCliente().getId());
			pst.setDate(3, new Date(reserva.getFecha_ingreso().getTime()));
			pst.setDate(4, new Date(reserva.getFecha_salida().getTime()));

			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	
	public boolean eliminarReserva(Reserva reserva) {
		String st = "DELETE FROM reservas WHERE id_parcela=? and id_clientes=? and fecha_ingreso=? and fecha_salida=?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);

			pst.setInt(1, reserva.getParcela().getId());
			pst.setInt(2, reserva.getCliente().getId());
			pst.setDate(3, new Date(reserva.getFecha_ingreso().getTime()));
			pst.setDate(4, new Date(reserva.getFecha_salida().getTime()));

			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
}
