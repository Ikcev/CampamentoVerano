package modeloDTO;

public class Parcela {
	private int id;
	private Zona zona;
	private Tipo tipo;
	private int grupo;
	private boolean limpia;
	private final int cantidadMax = 10;
	private final int cantidadMin = 30;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public int getGrupo() {
		return grupo;
	}
	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}
	public boolean getLimpia() {
		return limpia;
	}
	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}
	public int getCantidadMax() {
		return cantidadMax;
	}
	public int getCantidadMin() {
		return cantidadMin;
	}
}
