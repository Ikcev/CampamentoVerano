package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modeloDTO.Parcela;
import modeloDTO.Tipo;

public class ModeloParcela extends Conector{
	public boolean insertarParcela(Parcela parcela) {
		String st = "INSERT INTO parcelas (id_tipo, id_zona, id_grupo, limpia) values ?,?,?,?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setInt(1, parcela.getTipo().getId());
			pst.setInt(2, parcela.getZona().getId());
			pst.setInt(3, parcela.getGrupo().getId());
			pst.setBoolean(4, parcela.getLimpia());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean eliminarParcela(int id) {
		String st = "DELETE FROM parcelas WHERE id = ?";
		
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
	
	public boolean modificarParcela(Parcela parcela) {
		String st = "UPDATE parcelas SET id_tipo = ?, id_zona = ?, id_grupo = ?, limpia = ? WHERE id = ?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			pst.setInt(1, parcela.getTipo().getId());
			pst.setInt(2, parcela.getZona().getId());
			pst.setInt(3, parcela.getGrupo().getId());
			pst.setBoolean(4, parcela.getLimpia());
			pst.setInt(5, parcela.getId());
			
			pst.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public Parcela getParcela(int id) {
		String st = "SELECT * FROM parcelas WHERE id=?";
		
		try {
			PreparedStatement pst = super.connection.prepareStatement(st);
			
			ResultSet rs = pst.executeQuery();
			rs.next();
			
			ModeloTipo modeloTipo = new ModeloTipo();
			modeloTipo.conectar();
			
			Tipo tipo = modeloTipo.getTipo(rs.getInt("id_tipo"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
