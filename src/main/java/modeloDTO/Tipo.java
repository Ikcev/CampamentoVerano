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
	
	public Tipo(Integer id, String nombre, Integer cantidad_personas, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad_personas = cantidad_personas;
		this.descripcion = descripcion;
	}
	public Tipo() {
		super();
	}
	
	
}
