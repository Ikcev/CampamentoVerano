package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Reserva;

public class ModeloReserva extends Conector{
	public boolean insertarZona(Reserva reserva) {

		String st = "INSERT INTO reservas (parcela,clientes,fecha_ingreso,fecha_salida) VALUES (?,?,?,?)";

		try {
			PreparedStatement pst = super.connection.prepareStatement(st);

			pst.setInt(1, reserva.getParcela().getId());

			pst.execute();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
}
