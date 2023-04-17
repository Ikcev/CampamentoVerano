package modeloDTO;

import java.util.ArrayList;

public class Cliente extends Usuario{
	private ArrayList<Mascota> mascotas = new ArrayList<>();

	public ArrayList<Mascota> getMascotas() {
		return mascotas;
	}

	public void agregarMascota(Mascota mascota) {
		mascotas.add(mascota);
	}
}
