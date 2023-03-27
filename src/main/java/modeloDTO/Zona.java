package modeloDTO;

public class Zona {
	private Integer id;
	private String nombre;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zona(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public Zona() {
		super();
	}
	
}
