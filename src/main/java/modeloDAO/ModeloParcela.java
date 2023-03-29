package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.Parcela;
import modeloDTO.Zona;

public class ModeloParcela extends Conector {
	public boolean insertarZona(Parcela parcela) {

		String st = "INSERT INTO parcelas (zona,tipo,grupo,limpia,cantidad_max,cantidad_min) VALUES (?,?,?,?,?,?)";

		try {
			PreparedStatement pst = super.connection.prepareStatement(st);

			pst.setInt(1, parcela.getZona().getId());
			pst.setInt(2, parcela.getTipo().getId());
			pst.setInt(3, parcela.getGrupo());
			pst.setBoolean(4, parcela.getLimpia());
			pst.setInt(5, parcela.getCantidadMax());
			pst.setInt(6, parcela.getCantidadMin());

			pst.execute();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
