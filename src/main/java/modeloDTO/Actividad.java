package modeloDTO;

public class Actividad {
	private Integer id;
	private Zona zona;
	private String nombre;
	private Integer cantidad_max;
	private Integer edad_min;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantidad_max() {
		return cantidad_max;
	}
	public void setCantidad_max(Integer cantidad_max) {
		this.cantidad_max = cantidad_max;
	}
	public Integer getEdad_min() {
		return edad_min;
	}
	public void setEdad_min(Integer edad_min) {
		this.edad_min = edad_min;
	}
	
}
