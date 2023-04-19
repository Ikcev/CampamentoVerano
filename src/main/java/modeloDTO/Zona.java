package modeloDTO;

public class Zona {
	private int id;
	private String nombre;
	private Limpieza limpiador;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Limpieza getLimpiador() {
		return limpiador;
	}
	public void setLimpiador(Limpieza limpiador) {
		this.limpiador = limpiador;
	}
	
}
