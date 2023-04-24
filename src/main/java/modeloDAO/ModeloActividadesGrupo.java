package modeloDAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modeloDTO.ActividadesPorGrupo;

public class ModeloActividadesGrupo extends Conector{
	public boolean insertarActividadGrupo(ActividadesPorGrupo actividadesPorGrupo) {
		String st = "INSERT INTO actividades_grupo VALUES ?,?,?,?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setInt(1, actividadesPorGrupo.getActividad().getId());
			pst.setInt(2, actividadesPorGrupo.getGrupo().getId());
			pst.setDate(3, new Date(actividadesPorGrupo.getFecha().getTime()));
			pst.setString(4, actividadesPorGrupo.getHora());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean eliminarActividadGrupo(int id) {
		String st = "DELETE FROM actividades_grupo WHERE id=?";
		
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
