package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Zona;

public class ModeloZona extends Conector {
	public boolean insertarZona(Zona zona) {

		String st = "INSERT INTO zonas (nombre) VALUES (?)";

		try {
			PreparedStatement pst = super.connection.prepareStatement(st);

			pst.setString(1, zona.getNombre());

			pst.execute();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
}
