package modeloDTO;

public class Tipo {
	private Integer id;
	private String nombre;
	private Integer cantidad_personas;
	private String descripcion;
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
	public Integer getCantidad_personas() {
		return cantidad_personas;
	}
	public void setCantidad_personas(Integer cantidad_personas) {
		this.cantidad_personas = cantidad_personas;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
